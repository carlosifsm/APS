package model.command;
import model.interfaces.IVolume;

public class AumentarVolumeCommand implements ICommand{

    IVolume dispositivo;

    public AumentarVolumeCommand(IVolume reciever){
        this.dispositivo = reciever;
    }

    @Override
    public void execute(){
        dispositivo.aumetarVolume();
    }

    @Override
    public void undo() {
        dispositivo.diminuirVolume();
    }
}
