_monitor Monitor {

    _var int conteoNS = 0; // Contador de autos cruzando de Norte a Sur
    _var boolean NopuedoCruzarNS = false;
    _condvar queSeLibereNS;
    _var int autosEsperandoNS = 0;

    _var int conteoSN = 0; // Contador de autos cruzando de Sur a Norte
    _var boolean NopuedoCruzarSN = false;
    _condvar queSeLibereSN;
    _var int autosEsperandoSN = 0;

    _proc void cruzarNS(){
        // Si no se puede cruzar, esperar
        while(NopuedoCruzarNS || conteoNS==5){
            autosEsperandoNS++;
            _wait(queSeLibereNS);
            autosEsperandoNS--;
        }

        // Permitir cruce de Norte a Sur
        NopuedoCruzarSN = true; // Bloquear la dirección Sur a Norte
        conteoNS++;
    }

    _proc void terminoNS(){
        // Si hay autos esperando en la dirección contraria y se alcanzó el límite de N autos
        if(autosEsperandoSN != 0 && conteoNS == 5){
            conteoNS = 0;
            NopuedoCruzarNS = true;  // Bloquear el cruce de Sur a Norte
            NopuedoCruzarSN = false; // Permitir el cruce de Norte a Sur
            for(int j = 0; j < autosEsperandoSN; j++){
                _signal(queSeLibereSN); // Despertar a los autos esperando en el Norte
            }
        }else{
            if(autosEsperandoSN == 0){
                conteoNS=6;
            }
        }
    }

    _proc void cruzarSN(){
        // Si no se puede cruzar, esperar
        while(NopuedoCruzarSN || conteoSN==5){
            autosEsperandoSN++;
            _wait(queSeLibereSN);
            autosEsperandoSN--;
        }

        // Permitir cruce de Sur a Norte
        NopuedoCruzarNS = true; // Bloquear la dirección Norte a Sur
        conteoSN++;
    }

    _proc void terminoSN(){
        // Si hay autos esperando en la dirección contraria y se alcanzó el límite de N autos
        if(autosEsperandoNS != 0 && conteoSN == 5){
            conteoSN = 0;
            NopuedoCruzarSN = true;  // Bloquear el cruce de Sur a Norte
            NopuedoCruzarNS = false; // Permitir el cruce de Norte a Sur
            for(int j = 0; j < autosEsperandoNS; j++){
                _signal(queSeLibereNS); // Despertar a los autos esperando en el Norte
            }
        }else{
            if(autosEsperandoNS == 0){
                conteoSN=6;
            }
        }
    }
}
