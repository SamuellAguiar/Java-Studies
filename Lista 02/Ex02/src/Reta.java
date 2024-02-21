public class Reta {
    private Ponto2D x;
    private Ponto2D y;

    public Reta() {
        this.x = new Ponto2D(0, 0);
        this.y = new Ponto2D(0, 0);
    }

    public Reta(Ponto2D x, Ponto2D y) {
        this. x = x;
        this.y = y;
    }

    public Reta(Ponto2D y){
        this.x = new Ponto2D(0, 0);
        this.y = y;        
    }

    public Reta(double x1, double y1, double x2, double y2) {
        this.x = new Ponto2D(x1, y1);
        this.y = new Ponto2D(x2, y2);
    }

    public Ponto2D getX() {
        return x;
    }

    public void setX(Ponto2D x) {
        this.x = x;
    }

    public Ponto2D getY() {
        return y;
    }

    public void setY(Ponto2D y) {
        this.y = y;
    }

}
