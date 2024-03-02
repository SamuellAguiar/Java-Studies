// Arquivo Incremental.java
public class Incremental {
    private static Incremental instance = null;
    private static int count = 0;
    private int numero;

    // Construtor privado para evitar instanciação externa
    private Incremental() {
        numero = ++count;
    }

    // Método estático para obter a instância única da classe
    public static Incremental getInstance() {
        if (instance == null) {
            instance = new Incremental();
        }
        return instance;
    }

    public String toString() {
        return "Incremental " + numero;
    }
}
