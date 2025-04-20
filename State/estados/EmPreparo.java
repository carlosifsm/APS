package State.estados;

public class EmPreparo implements IState{

    @Override
    public void action() {
        System.out.println("Preparando o pedido...");
    }

    @Override
    public void proximo(Pedido p) {
        p.setEstado(new Pronto());
    }

    @Override
    public void notificar() {
        System.out.println("Seu pedido está sendo preparado.");
    }

}
