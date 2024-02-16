public class SegundoGrau extends Equacoes {
    private double c;

    public SegundoGrau(double a, double b, double c, double x) {
        super(a, b, x);
        this.c = c;
    }

    @Override
    public double valorY() {
        return a * x * x + b * x + c;
    }

    @Override
    public String toString() {
        return "y = " + a + "x^2 + " + b + "x + " + c;
    }
}