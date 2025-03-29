package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ControleRemoto {
    private static Map<String, ICommand> comandos = new HashMap<String, ICommand>();
    private static Stack<ICommand> hist = new Stack<ICommand>();
    static{
        comandos.put("a", new ACommand());
        comandos.put("A", new ACommand());
        comandos.put("b", new ACommand());
    }

    public static void execute( String nome ){
        try{
            ICommand cmd = comandos.get(nome);
            cmd.execute();
            hist.push(cmd);
        }catch(NullPointerException e){
            System.out.println("erro: comando não existe");
        }
    }

}
