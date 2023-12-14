public class Circulo  extends FormaBidimensional{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double obterArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double obterPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Circulo");
        System.out.println("Raio: " + raio);
        System.out.println("Area: " + obterArea());
        System.out.println("Perimetro: " + obterPerimetro());
    }
    
}
