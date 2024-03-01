public class Retangulo implements ObjetoGeometrico{
    private double base, altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }


    public void setBase(double base) {
        this.base = base;
    }


    public double getAltura() {
        return altura;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Base: " + this.base + "\nAltura: " + this.altura);
    }

    @Override
    public double area() {
        return this.base * this.altura;
    }

    @Override
    public double perimetro() {
        double calculo = 2 * base + 2 * altura;
        return calculo;
    }
    
}
