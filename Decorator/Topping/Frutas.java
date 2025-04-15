package Topping;
import SaboresAcai.Acai;

public class Frutas extends ToppingDecorator {
    public Frutas(Acai acai) {
        super(acai);
    }

    @Override
    public String getDescricao() {
        return acai.getDescricao() + " + Frutas";
    }

    @Override
    public double getPreco() {
        return acai.getPreco() + 2.0;
    }
}