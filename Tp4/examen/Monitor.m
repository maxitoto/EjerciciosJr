_monitor Monitor {
    static final int limite = 5;

    _var boolean turno = true;
    _var int NautosPasanS = 0;
    _var int SautosPasanN = 0;

    _var int esperandoLadoNorte, esperandoLadoSur = 0;

    _condvar turnoSur;
    _condvar turnoNorte;

    _proc void entradaLadoNorte(){
        while(!turno){
            esperandoLadoNorte++;
            _wait(turnoNorte);
            esperandoLadoNorte--;
        }

        while(NautosPasanS>=limite){
            esperandoLadoNorte++;
            _wait(turnoNorte);
            esperandoLadoNorte--;
        }

        NautosPasanS++;
    }



    _proc void salidaLadoNorte(){
        if(turno & esperandoLadoSur==0){//si del otro lado no hay nadie, entonces despierto a todos de este lado.
            NautosPasanS=(esperandoLadoNorte*-1)+limite;//voy por debajo del limite para cuando pase el ultimo auto por el while, recien ahi NautosPasanS sea igual a limite.
            System.out.println("Desde el norte no veo a nadie en el sur, entonces pasamos todos");
            _signal_all(turnoNorte);
        }else{
            if(turno & esperandoLadoSur>0 & NautosPasanS>=limite){//despierto 5 "al mismo tiempo" del otro lado, no hay o no 5 no importa.
                SautosPasanN=0;
                NautosPasanS=0;//reset para proxima vuelta del otro lado, si es que ocurre.
                turno=!turno;
                System.out.println("ya pasamos "+limite+" autos hacia el sur, es el turno de los autos del sur");
                for(int i = 0; i<limite; i++){
                    _signal(turnoSur);
                }
            }else{
                if(turno & esperandoLadoNorte==0 & NautosPasanS<limite){//si ya no queda nadie de este lado y no llegamos al limite, sedo el turno
                SautosPasanN=0;
                NautosPasanS=0;
                turno=!turno;
                System.out.println("Nadie espera de este lado(Norte) y pasamos menos de "+limite);
                    for(int i = 0; i<limite; i++){//si se pierden signals porque hay menos de 5 esperando del otro lado, no importa
                        _signal(turnoSur);
                    }
                }
            }    
        }
    }
    


    _proc void entradaLadoSur(){
        while(turno){
            esperandoLadoSur++;
            _wait(turnoSur);
            esperandoLadoSur--;
        }

        while(SautosPasanN>=limite){
            esperandoLadoSur++;
            _wait(turnoSur);
            esperandoLadoSur--;
        }

        SautosPasanN++;
    }


    _proc void salidaLadoSur(){
        if(!turno & esperandoLadoNorte==0){
            SautosPasanN=(esperandoLadoSur*-1)+limite;
            System.out.println("Desde el sur no veo a nadie en el norte, entonces pasamos todos");
            _signal_all(turnoSur);
        }else{
                if(!turno & esperandoLadoNorte>0 & SautosPasanN>=limite){
                    NautosPasanS=0;
                    SautosPasanN=0;
                    turno=!turno;
                    System.out.println("ya pasamos "+limite+" autos hacia el norte, es el turno de los autos del norte");
                    for(int i = 0; i<limite; i++){
                        _signal(turnoNorte);
                    }
                }else{
                        if(!turno & esperandoLadoSur==0 & SautosPasanN<limite){//si ya no queda nadie de este lado y no llegamos al limite, sedo el turno
                            NautosPasanS=0;
                            SautosPasanN=0;
                            turno=!turno;
                            System.out.println("Nadie espera de este lado(sur) y pasamos menos de "+limite);
                            _signal_all(turnoNorte);
                        }
                    }
                           
            }
    }
}
    



