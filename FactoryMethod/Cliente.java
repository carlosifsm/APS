import fabricas.*;
import personagens.*;

public class Cliente {
    public static void main(String[] args) {
        PersonagemFactory guerreiroFac = new GuerreiroFactory();
        PersonagemFactory magoFac = new MagoFactory();
        PersonagemFactory arqueiroFac = new ArqueiroFactory();

        IPersonagem guerreiro = guerreiroFac.criarPersonagem();
        IPersonagem mago = magoFac.criarPersonagem();
        IPersonagem arqueiro = arqueiroFac.criarPersonagem();

        guerreiro.atacar();
        guerreiro.defender();
        
        mago.atacar();
        mago.defender();
        
        arqueiro.atacar();
        arqueiro.defender();
    }

}