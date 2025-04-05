package fabricas;
import personagens.*;

public class GuerreiroFactory extends PersonagemFactory{    
    @Override
    public IPersonagem criarPersonagem() {
        return new Guerreiro();
    }
}