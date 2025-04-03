package model;

import model.interfaces.ILigavel;

//Classe Reciever
// Implementações genéricas
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
