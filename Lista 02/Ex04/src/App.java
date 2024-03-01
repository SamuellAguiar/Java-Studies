public class App {
    public static void main(String[] args) throws Exception {
        Triangulo triangulo = new Triangulo(3, 4, 5);
        Retangulo retangulo = new Retangulo(3, 4);
        Circulo circulo = new Circulo(3);

        System.out.println("Triângulo");
        triangulo.mostrarDados();
        System.out.println("Área: " + triangulo.area());
        System.out.println("Perímetro: " + triangulo.perimetro());

        System.out.println("\nRetângulo");
        retangulo.mostrarDados();
        System.out.println("Área: " + retangulo.area());
        System.out.println("Perímetro: " + retangulo.perimetro());

        System.out.println("\nCírculo");
        circulo.mostrarDados();
        System.out.println("Área: " + circulo.area());
        System.out.println("Perímetro: " + circulo.perimetro());
    }
}
