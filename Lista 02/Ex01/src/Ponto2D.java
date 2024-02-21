public class Ponto2D {
    private double x;
    private double y;

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ponto2D() {
        this.x = 0;
        this.y = 0;
    }

    public double distancia(Ponto2D p) {
        double calculo  = Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
        return calculo;
    }

    public double distancia() {
        Ponto2D p = new Ponto2D();
        return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
    }
}
