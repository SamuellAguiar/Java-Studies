public class Retangulo implements ObjetoGeometrico{
    private double base;
    private double altura;

    public Retangulo(double base, double altura){
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
    public void dados() {
        System.out.println("Base: " + this.base);
        System.out.println("Altura: " + this.altura);
    }

    @Override
    public double perimetro() {
        return (2 * this.base) + (2 * this.altura);
    }

    @Override
    public double area() {
        return this.base * this.altura;
    }
}
