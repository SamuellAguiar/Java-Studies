import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quadrado quadrado = new Quadrado();

        double lado = -1;

        while (lado < 0) {
            try {
                System.out.print("Digite o valor do lado do quadrado: ");
                lado = scanner.nextDouble();
                quadrado.setLado(lado);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                lado = -1; // Reseta o valor de lado para continuar o loop
            }
        }

        double área = quadrado.calcularÁrea();
        System.out.println("Área do quadrado: " + área);
    

        scanner.close();
    }
}