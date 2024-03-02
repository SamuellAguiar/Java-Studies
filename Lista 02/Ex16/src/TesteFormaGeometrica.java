public class TesteFormaGeometrica {
    public static void main(String[] args) {
        FormaGeometrica circulo = FormaFactory.criar("circulo");
        FormaGeometrica quadrado = FormaFactory.criar("quadrado");
        FormaGeometrica triangulo = FormaFactory.criar("triangulo");

        circulo.desenhar();
        quadrado.desenhar();
        triangulo.desenhar();
    }
}
