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
        
        ICommand cmd = comandos.get(nome);
        if(cmd == null){
            System.out.println("erro: comando não existe");
            return;
        }
        cmd.execute();
        hist.push(cmd);
            
    }

    public static void undo(){
        if(hist.isEmpty()){
            System.out.println("erro: não existe mais comandos");
            return; 
        }
        ICommand cmd = hist.pop();
        cmd.undo();

    }

}
