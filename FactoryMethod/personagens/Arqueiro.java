package personagens;


public class Arqueiro implements IPersonagem {    
    @Override
    public void atacar() {
        System.out.println("Arqueiro ataca com uma flecha de madeira");
    }
    
    @Override
    public void defender() {
        System.out.println("Arqueiro defende com um escudo de madeira");
    }
}