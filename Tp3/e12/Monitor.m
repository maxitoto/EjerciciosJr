_monitor Monitor{

    _var boolean p = false;
    _condvar ponganLaPizza;

    _var boolean s = false;
    _condvar ponganLaSalsa;

    _var boolean q = false;
    _condvar ponganElQueso;

    _var boolean t = false;
    _condvar ponganLosToppings;


_proc String preprarpizza(){
    System.out.println("La pizza se encuentra en la mesa");
    p=true;
    _signal(ponganLaPizza);

    if(!t){
        _wait(ponganLosToppings);
    }

    p=false;
    s=false;
    q=false;
    t=false;
    _return "pizza terminada";
}

_proc void colocarSalsa(){
    if(!p){
        _wait(ponganLaPizza);
    }

    s=true;
    System.out.println("Se le coloco salsa a la pizza");
    _signal(ponganLaSalsa);

}

_proc void colocarQueso(){
    if(!s){
        _wait(ponganLaSalsa);
    }

    q=true;
    System.out.println("Se le coloco queso a la pizza");
    _signal(ponganElQueso);
}

_proc void colocarToppings(){
    if(!q){
        _wait(ponganElQueso);
    }

    t=true;
    System.out.println("Se le coloco toppings a la pizza");
    _signal(ponganLosToppings);
}

}