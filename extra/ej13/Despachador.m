_monitor Despachador{

    _var boolean cpu_uno_libre = true;
    _var boolean cpu_dos_libre = true;

    _condvar cpu;
    _condvar wait_process; 

    _var int procesos_esperando = 0;

    _var int procesos_asignados = 0;

    _proc void asignar_proceso(int cpu_id) {
        if (cpu_id == 1) {
            if (cpu_uno_libre) {
                _wait(wait_process);
            }
        } else {
            if (cpu_dos_libre) {
                _wait(wait_process);
            }
        }
    }

    _proc void terminar_proceso(int cpu_id) {
        if (cpu_id == 1) {
            cpu_uno_libre = true;
            _signal(cpu);
        } else {
            cpu_dos_libre = true;
        }
    }

    _proc void adquirir_cpu() {
        procesos_esperando++;
        if (cpu_uno_libre) {
            cpu_uno_libre = false;
            _signal(wait_process);
            procesos_asignados++;
        } else if(cpu_dos_libre) {
            cpu_dos_libre = false;
            _signal(wait_process);
            procesos_asignados++;
        } else {
            _wait(cpu);
            procesos_asignados++;
        }
        System.out.println("c");
        procesos_esperando--;
    }

    _proc void get_procesos_asignados() {
        System.out.println(procesos_asignados); 
    }
    
}