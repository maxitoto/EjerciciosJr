_monitor Semaforo{
    //compilar m2jr  MonitorTest.m
    _var int bloqueados = 1;
    _condvar s;

    _proc void await(){
        while(bloqueados == 0){
            _wait(s);
        }
        bloqueados=0;
    }

    _proc void asignal(){
        bloqueados=1;
        _signal(s);
    }

}