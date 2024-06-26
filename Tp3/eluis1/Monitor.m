_monitor Monitor{
    //_var int cantidadDeRuedas = 0;
    //_var boolean cuadro = false;
    //_var boolean manillar = false;
    //los OP no tinen donde guardar los componentes producidos
    //dice el enunciado

    _condvar terminenLaPrimerRueda;
    _condvar terminenLasRuedas;
    _condvar terminenUnaRueda;
    _condvar terminenOtraRueda;
    _condvar terminenElManillar;
    _condvar termineneElCuadro;
    _condvar pidanUnCuadro;

_proc void ensamblarBicicleta(){
    System.out.println("El montador solcita las partes de una bicicleta");
    _signal(pidanUnCuadro);

    System.out.println("El montador espera a que terminen de fabricar los componentes");
    _wait(terminenLasRuedas);
    System.out.println("El montador arma una bicileta");
}

_proc void montarCuadro(){
    _wait(pidanUnCuadro);
    System.out.println("El Op1 termino el cuadro");
    _signal(termineneElCuadro);
}

_proc void montarManillar(){
    _wait(termineneElCuadro);
    System.out.println("El Op2 termino el manillar");
    _signal(terminenUnaRueda);

    _wait(terminenLaPrimerRueda);//necesario para que no se pierda la señal del segundo _signal "terminenOtraRueda"
    _signal(terminenOtraRueda);
}

_proc void montarRuedas(){
    _wait(terminenUnaRueda);
    System.out.println("El Op3 termino una rueda");
    _signal(terminenLaPrimerRueda);
    _wait(terminenOtraRueda);
    System.out.println("El Op3 termino otra rueda");
    _signal(terminenLasRuedas);
}

}