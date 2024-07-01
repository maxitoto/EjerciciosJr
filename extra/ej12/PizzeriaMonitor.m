_monitor PizzeriaMonitor {


    _var boolean hay_queso = false;
    _var boolean hay_salsa = false;
    _var boolean hay_morron = false;


    _condvar queso_listo;
    _condvar queso;

    _condvar salsa_lista;
    _condvar salsa;

    _condvar morron_listo;
    _condvar morron;

    _proc void preparar_ingrediente(String ingrediente) {
        if (ingrediente == "queso") {
            hay_queso = true;
            _signal(queso_listo);
            _wait(queso);
        } else if (ingrediente == "salsa"){
            hay_salsa = true;
            _signal(salsa_lista);
            _wait(salsa);
        } else {
            hay_morron = true;
            _signal(morron_listo);
            _wait(morron);
        }
    }

    _proc void solicitar_ingrediente(String ingrediente) {
        if (ingrediente == "queso") {
            if (hay_queso) {
                hay_queso = false;
                _signal(queso);
            } else {
                _wait(queso_listo);
                hay_queso = false;
                _signal(queso);
            }
        } else if (ingrediente == "salsa") {
            if (hay_salsa) {
                hay_salsa = false;
                _signal(salsa);
            } else {
                _wait(salsa_lista);
                hay_salsa = false;
                _signal(salsa);
            }
        } else {
            if (hay_morron) {
                hay_morron = false;
                _signal(morron);
            } else {
                _wait(morron_listo);
                hay_morron = false;
                _signal(morron);
            }
        }
    }
}