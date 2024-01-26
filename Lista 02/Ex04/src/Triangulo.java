public class Triangulo implements ObjetoGeometrico{

    private double lado1, lado2, lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double semiPerimetro(){
        return (lado1 + lado2 + lado3) / 2;
    }

    @Override
    public void dados() {
        System.out.println("Lado 1: " + this.lado1);
        System.out.println("Lado 2: " + this.lado2);
        System.out.println("Lado 3: " + this.lado3);
    }

    @Override
    public double area(){
        return Math.sqrt(semiPerimetro()*(semiPerimetro() - lado1)*(semiPerimetro() - lado2)*(semiPerimetro() - lado3));
    }

    @Override
    public double perimetro(){
        return lado1 + lado2 + lado3;
    }

}
