public class Reta {
    private double a;
    private double b;

    public Reta(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "y = " + this.a + "x + " + this.b;
    }

    public String intersecao(Reta outra) {
        if (this.a == outra.getA()) {
            return "Paralelas";
        } else {
            double x = (outra.getB() - this.b) / (this.a - outra.getA());
            double y = this.a * x + this.b;
            return "(" + x + ", " + y + ")";
        }
    }
}
