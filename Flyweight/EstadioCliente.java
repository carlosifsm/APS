import java.util.*;

public class EstadioCliente {
    
    public static void main(String[] args) {
        Random random = new Random();
        
        TorcedorFactory factory = new TorcedorFactory();
        int capacidade = 45000;

        String[] roupas = {"Camisa A", "Camisa B", "Camisa C"};
        String[] cores = {"Azul", "Vermelho", "Verde"};
        String[] gestos = {"Pulando", "Batendo Palma", "Sentado"};

        for (int i = 0; i < capacidade; i++) {

            // Fazendo o processo de criação aleatório, mas mantendo as caracterísiticas do compartilhamanto de memória
            // Caso haja resultados repetidos (nesse exemplo: 3*3*3 = 27 combinações diferentes de torcedores)
            String roupa = roupas[random.nextInt(roupas.length)];
            String cor = cores[random.nextInt(cores.length)];
            String gesto = gestos[random.nextInt(gestos.length)];

            Torcedor torcedor = factory.getTorcedor(roupa, cor, gesto);
            //System.out.println("\n");

            //torcedor.exibir(i);
        }

        System.out.printf("%nQuantidade de torcedores únicos (Flyweights): %d%n",
                factory.getQuantidadeDeTorcedoresUnicos());
        System.out.printf("Total de torcedores criados: %,d%n", capacidade);
    }
}