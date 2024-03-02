import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        Verificador verificador = new Verificador();

        System.out.print("Digite uma string: ");
        String str = scanner.nextLine();

        try {
            verificador.verificar(str);
            System.out.println("A string é composta apenas por letras maiúsculas");
        } catch (Verificador.NaoEhLetraException e) {
            System.out.println(e.getMessage());
        } catch (Verificador.NaoEhMaiusculaException e) {
            System.out.println(e.getMessage());
        }
    }
}