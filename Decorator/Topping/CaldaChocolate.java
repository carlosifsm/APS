package Topping;
import SaboresAcai.Acai;

public class CaldaChocolate extends ToppingDecorator {
    public CaldaChocolate(Acai acai) {
        super(acai);
    }

    @Override
    public String getDescricao() {
        return acai.getDescricao() + " + Calda de Chocolate";
    }

    @Override
    public double getPreco() {
        return acai.getPreco() + 1.0;
    }
}
