package model;

import model.interfaces.ILigavel;
import model.interfaces.IVolume;

// Classe Recivier
// Implementações genéricas
public class TV implements IVolume, ILigavel {
    private int volume = 0;

    @Override
    public void ligar() {
        System.out.println("TV Ligada");
    }

    @Override
    public void desligar() {
        System.out.println("TV Desligada");
    }

    @Override
    public void aumetarVolume() {
        if(volume < 100)
            volume++;
        System.out.println("Volume TV: "+ volume );
    }

    @Override
    public void diminuirVolume() {
        if(volume > 0)
            volume--;
        System.out.println("Volume TV: "+ volume );
    }

}
