public class Quadrados extends FormaBidimensional{
    private double lado;

    public Quadrados(double lado){
        this.lado = lado;
    }

    @Override
    public double obterArea(){
        return Math.pow(lado, 2);
    }

    @Override
    public double obterPerimetro(){
        return 4 * lado;
    }

    @Override
    public void mostrarDados(){
        System.out.println("Quadrado");
        System.out.println("Lado: " + lado);
        System.out.println("Area: " + obterArea());
        System.out.println("Perimetro: " + obterPerimetro());
    }
}
