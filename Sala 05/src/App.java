import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<FormaBidimensional> formas = new ArrayList<FormaBidimensional>();
        
        formas.add(new Circulo(5));
        formas.add(new Quadrado(5));
        formas.add(new Triangulo(5, 5));

        for (FormaBidimensional forma : formas) {
            forma.mostrarDados();
        }
    }
}
