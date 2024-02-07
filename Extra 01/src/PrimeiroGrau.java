public class PrimeiroGrau extends Equacoes {
    public PrimeiroGrau(double a, double b, double x) {
        super(a, b, x);
    }

    @Override
    public double valorY() {
        return a * x + b;
    }

    @Override
    public String toString() {
        return "y = " + a + "x + " + b;
    }
}