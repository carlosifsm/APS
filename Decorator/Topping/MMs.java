package Topping;
import SaboresAcai.Acai;

public class MMs extends ToppingDecorator {
    public MMs(Acai acai) {
        super(acai);
    }

    @Override
    public String getDescricao() {
        return acai.getDescricao() + " + M&M";
    }

    @Override
    public double getPreco() {
        return acai.getPreco() + 2.5;
    }
}
