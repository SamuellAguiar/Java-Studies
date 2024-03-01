public class Circulo implements ObjetoGeometrico {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    

    @Override
    public void mostrarDados() {
        System.out.println("Raio: " + this.raio);
    }

    @Override
    public double area(){
        double calculo = Math.PI * this.raio * this.raio;
        return calculo;
    }

    @Override
    public double perimetro(){
        double calculo = 2 * Math.PI * this.raio;
        return calculo;
    }
}
