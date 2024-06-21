import java.util.LinkedList;
_monitor Monitor{
    _var LinkedList bufferS = new LinkedList();

    _condvar esperaraconsumir;

    _proc void producir(int id){
        //produccion sin limites
        bufferS.add((int)(Math.random()*50));
        System.out.println("productor "+id+" produce "+bufferS.getLast());
        if(bufferS.size()==1){
            _signal(esperaraconsumir);
        }
    }

    _proc void consumir(int id){
        if(bufferS.size()==0){
            _wait(esperaraconsumir);
        }
        System.out.println("consumidor "+id+" consume "+bufferS.poll()); 
    }

}