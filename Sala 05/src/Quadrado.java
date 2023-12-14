public class Quadrado extends FormaBidimensional{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double obterArea() {
        return Math.pow(lado, 2);
    }

    @Override
    public double obterPerimetro() {
        return lado * 4;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Quadrado");
        System.out.println("Lado: " + lado);
        System.out.println("Area: " + obterArea());
        System.out.println("Perimetro: " + obterPerimetro());
    }
}
