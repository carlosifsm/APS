package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ControleRemoto {
    private Map<String, ICommand> comandos = new HashMap<String, ICommand>();
    private Stack<ICommand> hist = new Stack<ICommand>();
    public ControleRemoto(){
        comandos.put("a", new ACommand());
        comandos.put("A", new ACommand());
        comandos.put("b", new ACommand());
    }

    public void execute( String nome ){
        ICommand cmd = comandos.get(nome);
        if(cmd == null){
            System.out.println("erro: comando não existe");
            return;
        }
        cmd.execute();
        hist.push(cmd);
    }

    public void undo(){
        if(hist.isEmpty()){
            System.out.println("erro: não existe mais comandos");
            return; 
        }
        ICommand cmd = hist.pop();
        cmd.undo();
    }

    public void putCommand(String nome, ICommand command){
        comandos.put(nome, command);
    }

}
