package State.estados;

public class AguardandoConfirmacao implements IState{

    @Override
    public void action() {
        System.out.println("Verificando disponibilidade do restaurante...");
    }

    @Override
    public void proximo(Pedido p) {
        p.setEstado(new EmPreparo());
    }

    @Override
    public void notificar() {
        System.out.println("Seu pedido está aguardando confirmação do restaurante.");
    }

}
