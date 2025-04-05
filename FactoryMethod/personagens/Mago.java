package personagens;

public class Mago implements IPersonagem {
    @Override        
    public void atacar() {
        System.out.println("Mago ataca com magia ancestral");
    }        

    @Override
    public void defender() {    
        System.out.println("Mago defende com magia ancestral");
    }
}   