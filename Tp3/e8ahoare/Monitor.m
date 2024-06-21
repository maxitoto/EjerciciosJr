_monitor Monitor{
    _var int bufferS = -1;

    _var int vacios = 1;
    _var int llenos = 0;

    _condvar esperaraconsumir;
    _condvar esperaraproducir;

    _proc void producir(int id){
        if(vacios==0){
            _wait(esperaraproducir);
        }

        bufferS = (int)(Math.random()*50);
        System.out.println("productor "+id+" produce "+bufferS);
        llenos++;
        vacios--;
        _signal(esperaraconsumir);
    }

    _proc void consumir(int id){
        if(llenos==0){
            _wait(esperaraconsumir);
        }

        System.out.println("consumidor "+id+" consume "+bufferS);
        vacios++;
        llenos--;
        _signal(esperaraproducir);
         
    }

}