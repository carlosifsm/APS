package State.estados;

public class SaiuParaEntrega implements IState{

    @Override
    public void action() {
        System.out.println("Entregador a caminho...");
    }

    @Override
    public void proximo(Pedido p) {
        p.setEstado(new Entregue());
    }

    @Override
    public void notificar() {
        System.out.println("Seu pedido saiu para entrega.");
    }

}
