package State;
import State.estados.Pedido;

public class Cliente {
    public static void main(String[] args) {
        Pedido p = new Pedido(1);
        CentralPedidos c = new CentralPedidos();
        
        c.pedir(p);
        System.out.println("\n------------\n");
        
        p = new Pedido(2);
        c.pedir(p);
    }
}
