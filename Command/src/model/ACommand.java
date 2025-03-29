package model;

public class ACommand implements ICommand{
    @Override
    public void execute(){
        System.out.println("aaaaaa");
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("Unimplemented method 'undo'");
    }
}
