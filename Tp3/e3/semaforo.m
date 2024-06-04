_monitor semaforo{
    _var int entrantes = 1;
    _condvar s;
    
    _proc void escribir(String txt){
        while(entrantes == 0){_wait(s);}
        --entrantes;
        System.out.println("el proceso "+txt+" usa el monitor");
        ++entrantes;
        _signal(s);
    }
    
}