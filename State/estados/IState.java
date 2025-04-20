package State.estados;

public interface IState {
    public void notificar();
    public void action();
    public void proximo(Pedido p);
}
