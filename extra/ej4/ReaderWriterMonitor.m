
_monitor ReaderWriterMonitor {


    _var int lectoresActivos = 0;
    _var int escritoresActivos = 0;
    _var int escritoresEsperando = 0;
    _var int lectoresEsperando = 0;

    _condvar puedo_leer;
    _condvar puedo_escribir;


    _proc void start_read() {
        
        pausa(150);
        lectoresEsperando++;
        if (escritoresActivos == 1) {
            _wait(puedo_leer); //bloqueo/espero a los escritores
        }
        lectoresEsperando--;
        lectoresActivos++;
    }

    _proc void end_read() {
        
        pausa(150);
        lectoresActivos--;
        
        if (escritoresEsperando > 0) {
            _signal(puedo_escribir);
        } else {
            _signal(puedo_leer);
        }

    }

    _proc void write(int i) {

        escritoresEsperando++;
        if (lectoresActivos > 0 || escritoresActivos > 0) {
            _wait(puedo_escribir);    
        }
        escritoresEsperando--;
        escritoresActivos++;
        //escribe
        System.out.println("el proceso " + i + " escribio");
        escritoresActivos--;

        if (escritoresEsperando > 0) {
            _signal(puedo_escribir);
        } else {
            _signal(puedo_leer);
        }

    }

    private static op void pausa(int tiempo){

        try{
            Thread.sleep(tiempo);
        }catch(java.lang.Exception e){}

    }
           


}