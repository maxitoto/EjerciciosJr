_monitor Monitor {
    _var boolean estaOcupado = false;
    _condvar selibereLaCalleNS;
    _condvar selibereLaCalleSN;

    _var int autosNSesperando = 0;
    _var int autosSNesperando = 0;
    _var int autospasan = 0;

    _proc void cruzar(int direccion) {
        if (direccion == 0){
            while(estaOcupado){
                autosNSesperando++;
                _wait(selibereLaCalleNS);
            }
        }else{
            while(estaOcupado){
                autosSNesperando++;
                _wait(selibereLaCalleSN);
            }
        }

        estaOcupado=true;
        autospasan++;
    }

    _proc void liberar(int direccion){
        estaOcupado=false;
        if(direccion == 0){
            if(autospasan<5 & autosNSesperando>0){
                autosNSesperando--;
                _signal(selibereLaCalleNS);
            }else{
                if(autospasan>=5 & autosNSesperando>0 & autosSNesperando==0){
                    autosNSesperando--;
                    _signal(selibereLaCalleNS);
                }else{
                    autospasan=0;
                    autosSNesperando--;
                    _signal(selibereLaCalleSN);
                }
            }
        }else{
            if(autospasan<5 & autosSNesperando>0){
                autosSNesperando--;
                _signal(selibereLaCalleSN);
            }else{
                if(autospasan>=5 & autosSNesperando>0 & autosNSesperando==0){
                    autosSNesperando--;
                    _signal(selibereLaCalleSN);
                }else{
                    autospasan=0;
                    autosNSesperando--;
                    _signal(selibereLaCalleNS);
                }
            }
        }
    }
}
