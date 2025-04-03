import model.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(".");

        ControleRemoto c = new ControleRemoto();
        
        c.execute("Ligar TV");
        c.execute("Desligar TV");
        
        c.execute("Ligar Luz");
        c.undo();
        
        for (int i = 0; i < 10; i++) {
            c.execute("Aumentar Volume da TV");
        }
        c.execute("Diminuir Volume da TV");
        
        c.execute("Mudar de Canal");

    }
}
