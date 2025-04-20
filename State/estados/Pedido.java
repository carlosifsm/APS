package State.estados;

public class Pedido {
    private IState estado;
    private int numero;

    public Pedido(int n){
        this.numero = n;
        this.estado = new AguardandoConfirmacao();
    }

    public void setEstado(IState estado) {
        this.estado = estado;
    }

    public void action(){
        System.out.println("Pedido: "+ numero);
        estado.action();
        estado.notificar();
        
        estado.proximo(this);
    }

}
