public class Circulo implements ObjetoGeometrico{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if(raio > 0){
            this.raio = raio;
        }
    }

    @Override
    public void dados() {
        System.out.println("Raio: " + this.raio);
    }

    @Override
    public double area(){
        return Math.PI * raio * raio;
    }

    @Override
    public double perimetro(){
        return 2 * Math.PI * raio;
    }
}
