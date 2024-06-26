_monitor Monitor{
    static String[] ingredientes = {"Tabaco","Papel","Cerillas"};
    static String[] mesa = new String[2];


    _condvar pongaIngredientes; _var boolean noPedirIngredientes = true;
    _condvar ponerIngredientes; _var boolean nadiequiereIng = false;
 
    _proc void colocarIngredientes(){
        while(nadiequiereIng){
            _wait(ponerIngredientes);
        }
        nadiequiereIng = true;

        int ingredienteYaexistente = (int) (Math.random() * 3);

        int j = 0;

        for(int i = 0; i<3; i++){
            if(!(i==ingredienteYaexistente)){
                mesa[j] = ingredientes[i];
                j++;
            }
        }

        System.out.println("Se coloco en la mesa "+mesa[0]+" y "+mesa[1]);

        noPedirIngredientes = false;
        _signal(pongaIngredientes);

    }

    _proc boolean comprobarMesa(int id){
        while(noPedirIngredientes){
            _wait(pongaIngredientes);
        }
        
        noPedirIngredientes = true;

        if(id == 1 & mesa[0]==ingredientes[0] & mesa[1]==ingredientes[1]){_return true;}
        else{
            if(id == 2 & mesa[0]==ingredientes[0] & mesa[1]==ingredientes[2]){_return true;}
                else{
                    if(id == 3 & mesa[0]==ingredientes[1] & mesa[1]==ingredientes[2]){_return true;}}}
        
        noPedirIngredientes = false;
        _signal(pongaIngredientes);
        _return false;            
    }

    _proc void fumar(int id){
        System.out.println("El fumador "+id+" fuma el cigarrillo");
        nadiequiereIng = false;
        _signal(ponerIngredientes);
    }
}