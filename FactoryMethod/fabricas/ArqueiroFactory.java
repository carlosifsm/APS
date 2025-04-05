package fabricas;
import personagens.*;


public class ArqueiroFactory extends PersonagemFactory{    
    @Override
    public IPersonagem criarPersonagem() {
        return new Arqueiro();
    }
}