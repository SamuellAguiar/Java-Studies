public class App {
    public static void main(String[] args) throws Exception {
        Circulo circulo = new Circulo(3);
        Retangulo retangulo = new Retangulo(3, 4);
        Triangulo triangulo = new Triangulo(3, 4, 5);

        System.out.println("Circulo:");
        circulo.dados();
        System.out.println("Area: " + circulo.area());
        System.out.println("Perimetro: " + circulo.perimetro());

        System.out.println(" ");
        System.out.println("Retangulo:");
        retangulo.dados();
        System.out.println("Area: " + retangulo.area());
        System.out.println("Perimetro: " + retangulo.perimetro());

        System.out.println(" ");
        System.out.println("Triangulo:");
        triangulo.dados();
        System.out.println("Area: " + triangulo.area());
        System.out.println("Perimetro: " + triangulo.perimetro());

    }
}
