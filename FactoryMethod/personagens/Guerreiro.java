package personagens;


public class Guerreiro implements IPersonagem {
    @Override
    public void atacar() {
        System.out.println("Guerreiro ataca com uma espada de ferro");
    }

    @Override
    public void defender() {    
        System.out.println("Guerreiro defende com um escudo de ferro");
    }
}