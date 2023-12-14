public class Triangulo extends FormaBidimensional{
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double obterArea() {
        return (base * altura) / 2;
    }

    @Override
    public double obterPerimetro() {
        return base * 3;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Triangulo");
        System.out.println("Base: " + base + " Altura: " + altura);
        System.out.println("Area: " + obterArea());
        System.out.println("Perimetro: " + obterPerimetro());
    }
}
