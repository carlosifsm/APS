package State.estados;

public class Pronto implements IState{

    @Override
    public void action() {
        System.out.println("Chamando entregador...");
    }

    @Override
    public void proximo(Pedido p) {
        p.setEstado(new SaiuParaEntrega());
    }

    @Override
    public void notificar() {
        System.out.println("Seu pedido está pronto para entrega.");
    }

}
