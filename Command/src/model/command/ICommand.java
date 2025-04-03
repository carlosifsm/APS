package model.command; 

public interface ICommand {
    public void execute();
    public void undo();
}
