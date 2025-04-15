import SaboresAcai.Acai;
import SaboresAcai.AcaiComBanana;
import SaboresAcai.AcaiComMorango;
import SaboresAcai.AcaiTradicional;
import Topping.Amendoim;
import Topping.CaldaChocolate;
import Topping.Frutas;
import Topping.LeiteCondensado;
import Topping.MMs;

public class MontadorAcai {
    public static void main(String[] args) {
        // Pedido 1
        Acai pedido1 = new AcaiTradicional();
        pedido1 = new Frutas(pedido1);
        pedido1 = new CaldaChocolate(pedido1);
        pedido1 = new LeiteCondensado(pedido1);
        System.out.println("Pedido 1: " + pedido1.getDescricao());
        System.out.printf("Valor final: R$ %.2f\n\n", pedido1.getPreco());

        // Pedido 2
        Acai pedido2 = new AcaiComBanana();
        pedido2 = new Amendoim(pedido2);
        pedido2 = new MMs(pedido2);
        System.out.println("Pedido 2: " + pedido2.getDescricao());
        System.out.printf("Valor final: R$ %.2f\n\n", pedido2.getPreco());

        // Pedido 3
        Acai pedido3 = new AcaiComMorango();
        pedido3 = new CaldaChocolate(pedido3);
        pedido3 = new LeiteCondensado(pedido3);
        pedido3 = new Frutas(pedido3);
        pedido3 = new MMs(pedido3);
        System.out.println("Pedido 3: " + pedido3.getDescricao());
        System.out.printf("Valor final: R$ %.2f\n\n", pedido3.getPreco());
    }
}
