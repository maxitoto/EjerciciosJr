import java.util.LinkedList;
_monitor Monitor{
    _var static final int n = 10;
    _var String[] bufferS = new String[n];

    _var int cantElement = 0;
    _var int frente = 0;
    _var int cola = 0;

    _condvar sevacie;
    _condvar sellene;

    _proc void producir(int id){
        if(cantElement==n){
            _wait(sevacie);
        }

        bufferS[frente] = "producido por "+id;
        frente = (frente+1) % n;
        System.out.println("productor "+id+" produce en ["+cola+"]");
        
        cantElement+=1;
        
        _signal(sellene);

    }

    _proc void consumir(int id){
        if(cantElement==0){
            _wait(sellene);
        }

        System.out.println("consumidor "+id+" consume "+bufferS[cola]+"["+cola+"]");

        cola = (cola+1) % n;

        cantElement-=1;

        _signal(sevacie);
    }

}