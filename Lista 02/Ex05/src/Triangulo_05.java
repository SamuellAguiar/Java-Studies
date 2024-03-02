public class Triangulo_05 {
    protected double lado1;
    protected double lado2;
    protected double lado3;

    public Triangulo_05(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    // Implementação simplificada da fórmula de Heron para calcular a área
    public double calcularArea() {
        double s = calcularPerimetro() / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
}
