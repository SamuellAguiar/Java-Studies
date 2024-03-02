public class Quadrado {
    private double lado;

    public void setLado(double l) throws IllegalArgumentException {
        if (l < 0) {
            throw new IllegalArgumentException("O lado do quadrado não pode ser negativo.");
        }
        lado = l;
    }

    public double calcularÁrea() {
        return lado * lado;
    }
}