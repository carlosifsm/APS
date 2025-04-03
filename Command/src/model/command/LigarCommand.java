package model.command;
import model.interfaces.ILigavel;

public class LigarCommand implements ICommand{

    ILigavel ligavel;

    public LigarCommand(ILigavel reciever){
        this.ligavel = reciever;
    }

    @Override
    public void execute(){
        ligavel.ligar();
    }

    @Override
    public void undo() {
        ligavel.desligar();
    }
}
