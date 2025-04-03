package model.command;
import model.interfaces.ILigavel;

public class DesligarCommand implements ICommand{

    ILigavel ligavel;

    public DesligarCommand(ILigavel reciever){
        this.ligavel = reciever;
    }

    @Override
    public void execute(){
        ligavel.desligar();
    }

    @Override
    public void undo() {
        ligavel.ligar();
    }
}
