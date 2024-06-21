_monitor Monitor{

    _var int fichero = 0;

    _var int cantLectoresEsperando = 0;
    _var int cantLectoresLeyendo = 0;

    _var int cantEscritoresEsperando = 0;
    _var int cantEscritoresEscribiendo = 0;

    _condvar esperandoLeer; 
    _condvar esperandoEscribir;

    _proc void escribir(int id){
        if(cantEscritoresEscribiendo == 1 | cantLectoresLeyendo>0){//si alguien escribe o alguien esta leyendo, espero
            cantEscritoresEsperando++;
            _wait(esperandoEscribir);
            cantEscritoresEsperando--;
        }
        

        cantEscritoresEscribiendo++;
        fichero = (int)(Math.random()*50);
        System.out.println(
            " Escritor "+ id +" esta por escribir y dice{"+
            " lect leyendo: "+ cantLectoresLeyendo+
            " lect esperando: "+ cantLectoresEsperando+ 
            " escr escribiendo: "+cantEscritoresEscribiendo+
            " escr esperando: "+cantEscritoresEsperando+"}"
        );
        
        cantEscritoresEscribiendo--;

        if(cantLectoresEsperando>0 & cantEscritoresEscribiendo==0){//si hay lectores esperando y nadie escribiendo, despiesto a lectores
            for(int j = 0; j<cantLectoresEsperando; j++){
                _signal(esperandoLeer);
            }
        }else{
                if(cantEscritoresEsperando>0 & cantLectoresLeyendo==0){//si hay escritores esperando y nadie leyendo, despiesto a un escritor
                    _signal(esperandoEscribir);
                }
            }

        System.out.println("escritor"+ id+" dejo de escribir");
    }


    _proc int leer(int id){
        if(cantEscritoresEscribiendo == 1){//si estan escribiendo, espero
            cantLectoresEsperando++;
            _wait(esperandoLeer);
            cantLectoresEsperando--;
        }
    
        cantLectoresLeyendo++;
        System.out.println(
            " lector "+ id +" esta por leer y dice{"+
            " lect leyendo: "+ cantLectoresLeyendo+
            " lect esperando: "+ cantLectoresEsperando+ 
            " escr escribiendo: "+cantEscritoresEscribiendo+
            " escr esperando: "+cantEscritoresEsperando+"}"
        );
        _return fichero;
    }    

    _proc void pararDeLeer(int id){
        cantLectoresLeyendo--;
        System.out.println(
            " lector "+ id +" dejo de leer y dice{"+
            " lect leyendo: "+ cantLectoresLeyendo+
            " lect esperando: "+ cantLectoresEsperando+ 
            " escr escribiendo: "+cantEscritoresEscribiendo+
            " escr esperando: "+cantEscritoresEsperando+"}"
        );
        if(cantEscritoresEsperando>0 & cantLectoresLeyendo == 0 & cantEscritoresEscribiendo == 0){//si hay escritores esperando, no hay nadie leyendo y nadie escribiendo, entonces despiesto a un escritor
            _signal(esperandoEscribir);
        }else{
                if(cantLectoresEsperando>0 & cantEscritoresEscribiendo==0){//si hay lectores esperando y no hay nadie escribiendo, despiesto a todos los lectores
                    for(int j = 0; j<cantLectoresEsperando; j++){
                        _signal(esperandoLeer);
                    }
                }
                                                
            }
    }

}