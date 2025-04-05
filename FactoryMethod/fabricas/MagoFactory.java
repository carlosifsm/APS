package fabricas;
import personagens.*;

public class MagoFactory extends PersonagemFactory{    
    @Override
    public IPersonagem criarPersonagem() {
        return new Mago();
    }
}