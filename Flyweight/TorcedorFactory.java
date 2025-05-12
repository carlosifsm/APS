import java.util.*;

// Flyweight Factory
class TorcedorFactory {
    private final Map<String, Torcedor> torcedores = new HashMap<>();

    public Torcedor getTorcedor(String roupa, String corTime, String gesto) {
        String chave = roupa + "-" + corTime + "-" + gesto;

        if (!torcedores.containsKey(chave)) {
            torcedores.put(chave, new Torcedor(roupa, corTime, gesto));
        }

        return torcedores.get(chave);
    }

    public int getQuantidadeDeTorcedoresUnicos() {
        return torcedores.size();
    }
}
