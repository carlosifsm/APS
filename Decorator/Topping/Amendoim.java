package Topping;
import SaboresAcai.Acai;

public class Amendoim extends ToppingDecorator {
    public Amendoim(Acai acai) {
        super(acai);
    }

    @Override
    public String getDescricao() {
        return acai.getDescricao() + " + Amendoim";
    }

    @Override
    public double getPreco() {
        return acai.getPreco() + 1.5;
    }
}
