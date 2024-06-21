_monitor Monitor{

    _var int fichero = 0;

    _var int cantLectoresEsperando = 0;
    _var int cantLectoresLeyendo = 0;

    _var int cantEscritoresEsperando = 0;
    _var int cantEscritoresEscribiendo = 0;

    _condvar esperandoLeer; 
    _condvar esperandoEscribir;

    _proc void escribir(int id){
        System.out.println("escritor "+id+" entro");
        while(cantEscritoresEscribiendo == 1 | cantLectoresLeyendo>0){//si alguien escribe o alguien esta leyendo, espero
            cantEscritoresEsperando++;
            _wait(esperandoEscribir);
            cantEscritoresEsperando--;
        }
        

        cantEscritoresEscribiendo++;
        fichero = (int)(Math.random()*50);
        System.out.println(
            " Escritor "+ id +"dice{"+
            " lect leyendo: "+ cantLectoresLeyendo+
            " lect esperando: "+ cantLectoresEsperando+ 
            " escr escribiendo: "+cantEscritoresEscribiendo+
            " escr esperando: "+cantEscritoresEsperando+"}"
        );
        
        cantEscritoresEscribiendo--;

        if(cantLectoresEsperando==0){
            _signal(esperandoEscribir);
        }else{
            for(int j = 0; j<cantLectoresEsperando; j++){
                _signal(esperandoLeer);
            }
        }

        System.out.println("escritor"+ id+" dejo de escribir");
    }


    _proc int leer(int id){
        System.out.println("leer "+id+" entro");
        while(cantEscritoresEscribiendo == 1){//si estan escribiendo, espero
            cantLectoresEsperando++;
            _wait(esperandoLeer);
            cantLectoresEsperando--;
        }
    
        cantLectoresLeyendo++;
        System.out.println(
            " lector "+ id +"dice{"+
            " lect leyendo: "+ cantLectoresLeyendo+
            " lect esperando: "+ cantLectoresEsperando+ 
            " escr escribiendo: "+cantEscritoresEscribiendo+
            " escr esperando: "+cantEscritoresEsperando+"}"
        );
        _return fichero;
    }    

    _proc void pararDeLeer(int id){
        cantLectoresLeyendo--;
        System.out.println("lector "+id+" dejo de leer");
        if(cantLectoresEsperando>0){
            for(int j = 0; j<cantLectoresEsperando; j++){
                _signal(esperandoLeer);
            }
        }else{
            _signal(esperandoEscribir);
            }
    }
}