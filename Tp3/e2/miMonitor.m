_monitor miMonitor{
     _var int n = 0;
     _condvar nada;

    _proc String toString(){
        n++;
        _return "soy el monitor numero "+n;
    }
}