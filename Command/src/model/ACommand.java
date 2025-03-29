package model;

public class ACommand implements ICommand{
    @Override
    public void execute(){
        System.out.println("aaaaaa");
    }

    @Override
    public void undo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'undo'");
    }
}
