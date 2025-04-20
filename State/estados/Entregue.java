package State.estados;

public class Entregue implements IState{

    @Override
    public void action() {
        System.out.println("Finalizando pedido e processando pagamento.");
    }

    @Override
    public void proximo(Pedido p) {
        System.out.println("Pedido já foi entregue. Nenhuma transição disponível.");
    }

    @Override
    public void notificar() {
        System.out.println("Pedido entregue!");
    }

}
