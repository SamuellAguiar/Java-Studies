public class Reta {
    private double x;
    private double y;

    public Reta(){
        this.x = 0;
        this.y = 0;
    }

    public Reta(Ponto2D p1){
        this.x = p1.getX();
        this.y = p1.getY();
    }

    public Reta(Ponto2D p1, Ponto2D p2){
        this.x = p2.getX() - p1.getX();
        this.y = p2.getY() - p1.getY();
    }

    public Reta(double x1, double y1, double x2, double y2){
        this.x = x2 - x1;
        this.y = y2 - y1;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double tamanho(){
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public double angulo(){
        return Math.atan(this.y / this.x);
    }

    public double distancia(Reta r){
        return Math.sqrt(Math.pow((r.getX() - this.x), 2) + Math.pow((r.getY() - this.y), 2));
    }

    public double distancia(){
        Reta origem = new Reta(0, 0, 0, 0);
        return this.distancia(origem);
    }

    public boolean paralela(Reta r){
        return (this.angulo() == r.angulo());
    }

    
}  
