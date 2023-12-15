public class Triangulos extends FormaBidimensional{
    private double base;
    private double altura;
    private double lado;

    public Triangulos(double base, double altura, double lado){
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    @Override
    public double obterArea(){
        return (base * altura) / 2;
    }

    @Override   
    public double obterPerimetro(){
        return lado + lado + lado;
    }

    @Override
    public void mostrarDados(){
        System.out.println("Triangulo");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Area: " + obterArea());
        System.out.println("Perimetro: " + obterPerimetro());
    }
}
