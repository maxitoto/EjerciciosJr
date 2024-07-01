_monitor Puente {
    private static final int N = 5; // Maximo numero de vehiculos en el puente a la vez
    _var int turnoCount = 0; // Contador de vehiculos que han cruzado en el turno actual
    _var boolean turnoA = true; // True = turno del lado A, False = turno del lado B

    _condvar CanalA; // Condicion para los vehiculos esperando en el lado A
    _condvar CanalB; // Condicion para los vehiculos esperando en el lado B

    // Procedimiento para que un vehiculo del lado A entre al puente
    _proc void entrar_lado_A() {
        while (!turnoA || turnoCount > N) {
            System.out.println("Entra un auto del lado A a la cola.");
            _wait(CanalA); // Esperar en la condicion CanalA
        }
        turnoCount++; // Incrementar el contador de vehiculos en el turno actual
    }

    // Procedimiento para que un vehiculo del lado B entre al puente
    _proc void entrar_lado_B() {
        while (turnoA || turnoCount > N) {
            System.out.println("Entra un auto del lado B a la cola.");
            _wait(CanalB); // Esperar en la condicion CanalB
        }
        turnoCount++; // Incrementar el contador de vehiculos en el turno actual
    }

    // Procedimiento para que un vehiculo salga del puente
    _proc void salir() {
        
        
        turnoCount--; // Disminuir el contador de vehiculos cruzando del turno actual

        // Cambiar el turno si se han alcanzado N vehiculos o si no hay mas vehiculos del lado actual
        if (turnoCount == 0 || turnoCount < 0) {
            turnoA = !turnoA; // Cambiar el turno
            turnoCount = 0; // Resetear el contador del turno
            System.out.println("Cambio de Turno!");
        }
        
        
        
        // Senalar a los vehiculos esperando en el lado correspondiente
        if (turnoA) {
            System.out.println("Turno A ");
            System.out.println("Cruzo un Auto del lado A.");
            _signal(CanalA);
        } else {
            System.out.println("Turno B ");
            System.out.println("Cruzo un Auto del lado B.");
            _signal(CanalB);
        }

        System.out.println("====================");
    }
}

//La manera en que se compila este monitor es la siguiente 
// m2jr Puente.m
