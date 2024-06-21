_monitor Monitor{
    static final boolean[] CPUs = {true, true};
    _var int cpuDisponible = 2;
    _condvar hayaCPUdisponible;
    _var int contAsignaciones = 0;
    _var int soyElUltimo = 0;

    _proc int adquirirCPU(int Pid){
        soyElUltimo++;
        while(cpuDisponible==0){
            System.out.println("no hay recursos disponibles para el proceso "+Pid);
            _wait(hayaCPUdisponible);
        }

        soyElUltimo--;
        cpuDisponible--;

        if(CPUs[0]){
            CPUs[0]=false;
            contAsignaciones++;
            _return 0;
        }else{
            CPUs[1]=false;
            contAsignaciones++;
            _return 1;
        }
    }

    _proc void liberarCpu(int cpu){
            cpuDisponible++;

            CPUs[cpu]=true;
            _signal(hayaCPUdisponible);

            if(soyElUltimo==0){
            System.out.println("Asignaciones Totales: "+contAsignaciones);
        }
    }
}