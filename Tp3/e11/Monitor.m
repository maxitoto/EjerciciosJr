_monitor Monitor{

    private static final int recursosTotales = 10;
    _var int recursosNoAsignados = recursosTotales;
    _var int recursosAsigandos = 0;

    _condvar recursosDisponibles;

    _proc void solicitarRecursos(int i){
        if(recursosAsigandos==recursosTotales){
            System.out.println("sistema ["+recursosNoAsignados+"|"+recursosAsigandos+"] no cuenta con recursos suficientes el proceso "+i+" debe espera");
            _wait(recursosDisponibles);
        }

        recursosAsigandos+=2;
        recursosNoAsignados-=2;
        System.out.println("El proceso "+i+" obtuvo 2 recursos| estado del sistema ["+recursosNoAsignados+"|"+recursosAsigandos+"]");
    }

    _proc void devolverRecursos(int i){
        recursosAsigandos-=2;
        recursosNoAsignados+=2;
        System.out.println("El proceso "+i+" devulve 2 recursos| estado del sistema ["+recursosNoAsignados+" | "+recursosAsigandos+"]");
        _signal(recursosDisponibles);
    }
}