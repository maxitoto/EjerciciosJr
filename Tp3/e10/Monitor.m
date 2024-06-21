_monitor Monitor{ 
    _var boolean nolistoparacobrar = true;
    _var boolean nolistoparapagar = true;
    _var boolean barberoNohaTerminado = true;
    _var boolean corteNoTeminado = true;
    _var boolean sillaLibre = true;
    _var boolean barberoLibre = true;
    _var int clientesEsperando = 0;

    _condvar llegueUnCliente;
    _condvar poderAtenderme;
    _condvar terminadoA;
    _condvar terminadoB;
    _condvar aCobrar;
    _condvar pagar;

    _proc void duermeOtrabaja(){
        while(clientesEsperando==0 & sillaLibre){
            System.out.println("No hay nadie a quien atender entonces barbero duerme por "+clientesEsperando+" "+sillaLibre);
            _wait(llegueUnCliente);
        }
        barberoLibre = false;
        System.out.println("Barbero va a atender");
    }//aqui el barbero duerme o continua trabajando

    _proc void cortarPelo(){
        barberoNohaTerminado=false;
        while(corteNoTeminado){
            _wait(terminadoA);
        }
        _signal(terminadoB);
        System.out.println("Barbero corta el cabello a cliente");
    }//aqui se sincroniza con el cliente para cortar

    _proc void cobrarAlCliente(){
        nolistoparacobrar=false;
        while(nolistoparapagar){
            _wait(aCobrar);
        }
        _signal(pagar);
        System.out.println("Barbero le cobra al cliente");
    }//aqui se sincroniza con el cliente para cortar

    _proc void ingresar(){  
        clientesEsperando++;
        while(!(sillaLibre)){       
            System.out.println("Cliente debe esperar");
            _wait(poderAtenderme);
        }

        sillaLibre=false;
        _signal(llegueUnCliente);
        System.out.println("Cliente sera atendido");

    }//aqui o se sienta uno o espera con los demas

    _proc void seCortaElPelo(){
        corteNoTeminado=false;
        while(barberoNohaTerminado){
            _wait(terminadoB);
        }
          _signal(terminadoA);
        System.out.println("Cliente le corta el cabello el barbero");
    }//aqui se sincroniza con el barbero para cortar

    _proc void pagaAlBarebero(){
        nolistoparapagar=false;
        while(nolistoparacobrar){
            _wait(pagar);
        }
        _signal(aCobrar);
        System.out.println("Cliente le paga al barbero");
    }//aqui se sincroniza con el barbero para pagar

    _proc void seVa(){
        nolistoparacobrar=true;
        nolistoparapagar=true;
        barberoNohaTerminado=true;
        corteNoTeminado=true;
        sillaLibre=true;
        barberoLibre=true;
        clientesEsperando--;
        System.out.println("Cliente se va y deja su silla y hay "+clientesEsperando+" clientes esperando");
        if(clientesEsperando>0){_signal(poderAtenderme);}
        else{_signal(llegueUnCliente);}//para el print nada mas
        
    }//aqui el cliente se va de la barberia
}