public abstract class Equacoes {
    protected double a;
    protected double b;
    protected double x;

    public Equacoes(double a, double b, double x) {
        this.a = a;
        this.b = b;
        this.x = x;
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

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public abstract double valorY();

    public String toString(){
        return "y = f(x)";
    }
}
