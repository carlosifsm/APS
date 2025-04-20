package State;

import State.estados.*;

public class CentralPedidos {

    public void pedir(Pedido p){
        p.action(); //Aguardando Confirmação -> Em Preparo
        p.action(); //Em Preparo -> Pronto para Entrega
        p.action(); //Pronto para Entrega -> Saiu para Entrega
        p.action(); //Saiu para Entrega -> Entregue
        p.action(); //Entregue -> Nenhuma mudança de estado
    }

}
