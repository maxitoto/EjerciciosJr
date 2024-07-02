_monitor Monitor {
        static final int N = 5;

        _var int esperandoEnElNorte=0;
        _var int autosPasanNorte=0;
        _var int esperandoEnElSur=0;
        _var int autosPasanSur=0;

        _var boolean turno=true;

        _condvar seaTurnoNorte;
        _condvar seaTurnoSur;



        _proc void cruzarLadoNorte(){
            esperandoEnElNorte++;
            while(!turno || (autosPasanNorte==N)){
                _wait(seaTurnoNorte);
            }
            esperandoEnElNorte--;

            autosPasanNorte++;
        }

        _proc void cruzarLadoSur(){
            esperandoEnElSur++;
            while(turno || (autosPasanSur==N)){
                _wait(seaTurnoSur);
            }
            esperandoEnElSur--;

            autosPasanSur++;
        }

        _proc void salidaLadoSur(){
            autosPasanNorte--;
            if(autosPasanNorte==0 & esperandoEnElSur==0){
                _signal_all(seaTurnoNorte);
            }else{if(autosPasanNorte==0 & esperandoEnElSur>0){turno=!turno;_signal_all(seaTurnoSur);}}
        }
        

        _proc void salidaLadoNorte(){
            autosPasanSur--;
            if(autosPasanSur==0 & esperandoEnElNorte==0){
                _signal_all(seaTurnoSur);
            }else{if(autosPasanSur==0 & esperandoEnElNorte>0){turno=!turno; _signal_all(seaTurnoNorte);}}
        }

}

    



