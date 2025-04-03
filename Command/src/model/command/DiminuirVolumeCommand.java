package model.command;
import model.interfaces.IVolume;

public class DiminuirVolumeCommand implements ICommand{

    IVolume dispositivo;

    public DiminuirVolumeCommand(IVolume reciever){
        this.dispositivo = reciever;
    }

    @Override
    public void execute(){
        dispositivo.diminuirVolume();
    }
    
    @Override
    public void undo() {
        dispositivo.aumetarVolume();
    }
}
