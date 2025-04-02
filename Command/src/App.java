import model.*;

public class App {
    public static void main(String[] args) throws Exception {
        ControleRemoto c = new ControleRemoto();
        
        c.execute("a");
        c.execute("A");
        c.execute("b");
        c.execute("B");

        System.out.println("Hello, World!");
    }
}
