package Topping;
import SaboresAcai.Acai;

public abstract class ToppingDecorator implements Acai {
    protected Acai acai;

    public ToppingDecorator(Acai acai) {
        this.acai = acai;
    }
}