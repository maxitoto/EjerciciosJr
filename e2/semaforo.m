_monitor semaforo{
    _var int esperando = 1;
    _condvar s;
    
    _proc void await(){
        while(esperando == 0){_wait(s);}
        --esperando;
    }
    
    _proc void asignal(){
        ++esperando;
        _signal(s);
    }
}