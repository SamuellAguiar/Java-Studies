import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<FormaBidimensional> formas = new ArrayList<FormaBidimensional>();

        formas.add(new Triangulos(3, 4, 5));
        formas.add(new Quadrados(5));
        formas.add(new Circulos(2));

        for (FormaBidimensional forma : formas) {
            forma.mostrarDados();
            System.out.println(" ");
        }
    }
}
