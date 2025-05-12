
// Flyweight
class Torcedor {

    // Esatos compartilhados
    private final String roupa;
    private final String corTime;
    private final String gesto;

    public Torcedor(String roupa, String corTime, String gesto) {
        this.roupa = roupa;
        this.corTime = corTime;
        this.gesto = gesto;
    }

    // Estados individuais
    public void exibir(int cadeira) {
        System.out.printf("Torcedor [%s, %s, %s] na cadeira número %d",
                roupa, corTime, gesto, cadeira+1);
    }
}
