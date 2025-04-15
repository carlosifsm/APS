package Topping;
import SaboresAcai.Acai;

public class LeiteCondensado extends ToppingDecorator {
    public LeiteCondensado(Acai acai) {
        super(acai);
    }

    @Override
    public String getDescricao() {
        return acai.getDescricao() + " + Leite Condensado";
    }

    @Override
    public double getPreco() {
        return acai.getPreco() + 1.5;
    }
}
