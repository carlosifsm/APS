import model.*;

public class App {
    public static void main(String[] args) throws Exception {
        ControleRemoto.execute("a");
        ControleRemoto.execute("A");
        ControleRemoto.execute("b");
        ControleRemoto.execute("B");

        System.out.println("Hello, World!");
    }
}
