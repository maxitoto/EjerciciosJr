_monitor BoundedBuffer {
    private static final int N = 5; //Size of the buffer

    _var String[] buffer = new String[N];
    _var int front;
    _var int rear;
    _var int count;

    _condvar notFull;
    _condvar notEmpty;  

    _proc void deposit(String data){
        while(count == N){
            _wait(notFull);
        }

        buffer[rear] = data;
        rear = (rear + 1) % N;
        count++;

        _signal(notEmpty);
    }

    _proc String fetch(){
        while(count == 0){
            _wait(notEmpty);
        }

        String result = buffer[front];
        front = (front + 1) % N;
        count--;

        _signal(notFull);

        _return result;
     }
}

/*
Este es el codigo para compilar un monitor que luego se utiliza 
en un programa .jr.
La manera en que se compila este monitor es la siguiente 
    m2jr  Monitor.m //monitor MESA Lampson y Redell
    m2jr -sw  Monitor.m //monitor Hoare 

Signal & Continue (SC): The process who signal keep the mutual exclusion and the signaled will 
be awaken but need to acquire the mutual exclusion before going.
Signal & Wait (SW): The signaler is blocked and must wait for mutual exclusion to continue 
and the signaled thread is directly awaken and can start continue its operations.
Signal & Urgent Wait (SU): Like SW but the signaler thread has the guarantee than it would go 
just after the signaled thread
Signal & Exit (SX): The signaler exits from the method directly after the signal and the signaled 
thread can start directly. This philosophy is not often used.

Para compilar y hacer un Singal and exit es de esta manera
    m2jr -sx Monitor.m
*/