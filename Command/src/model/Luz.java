package model;

public class Luz implements ILigavel{

    @Override
    public void ligar() {
        System.out.println("Luz Ligada");
    }

    @Override
    public void desligar() {
        System.out.println("Luz Desligada");
    }
    
}
