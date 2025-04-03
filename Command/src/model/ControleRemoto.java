package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import model.command.*;

// Classe Invoker
public class ControleRemoto {
    private Map<String, ICommand> comandos = new HashMap<String, ICommand>();
    private Stack<ICommand> hist = new Stack<ICommand>();

    private TV tv = new TV();
    private Luz luz = new Luz();

    public ControleRemoto(){
        comandos.put("Ligar TV", new LigarCommand(tv));
        comandos.put("Desligar TV", new DesligarCommand(tv));

        comandos.put("Ligar Luz", new LigarCommand(luz));
        comandos.put("Desligar Luz", new DesligarCommand(luz));
        
        comandos.put("Aumentar Volume da TV", new AumentarVolumeCommand(tv));
        comandos.put("Diminuir Volume da TV", new DiminuirVolumeCommand(tv));
    }

    public void execute( String nome ){
        ICommand cmd = comandos.get(nome);
        if(cmd == null){
            System.err.println("Erro: comando "+ nome +" não existe\n Lista de comandos: "+ comandos.keySet());
            return;
        }
        cmd.execute();
        hist.push(cmd);
    }

    public void undo(){
        if(hist.isEmpty()){
            System.err.println("Erro: não existe mais comandos a serem desfeitos");
            return; 
        }
        ICommand cmd = hist.pop();
        cmd.undo();
    }

    // Possibilitar criação de novos comandos na lista de comandos.
    public void putCommand(String nome, ICommand command){
        comandos.put(nome, command);
    }

}
