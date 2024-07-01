_monitor WritePriorityMonitor {

    _var int waiting_readers = 0; 
    _var int waiting_writers = 0;

    _var int active_readers = 0;
    _var boolean active_writers = false;

    _condvar can_read;
    _condvar can_write;

    _proc void request_read() {
        waiting_readers++;
        if (active_writers) {
            _wait(can_read);
        }
        waiting_readers--;
        active_readers++;
    }

    _proc void release_read() {
        active_readers--;
        if (active_readers == 0 || waiting_writers > 0) {
            _signal(can_write);
        }
    }

    _proc void request_write() {
        waiting_writers++;
        if (active_readers > 0 || active_writers) {
            _wait(can_write);
        }
        active_writers = true;
        waiting_writers--;

    }

    _proc void release_write() {
        active_writers = false;
        if (waiting_writers > 0) {
            _signal(can_write);
        } else {
            _signal(can_read); //si no hay lectores no sirve para nada este signal
        }
    }
}