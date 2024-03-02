public class Retangulo_05 {
    protected double lado1;
    protected double lado2;

    public Retangulo_05(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double calcularArea() {
        return lado1 * lado2;
    }

    public double calcularPerimetro() {
        return 2 * (lado1 + lado2);
    }
}