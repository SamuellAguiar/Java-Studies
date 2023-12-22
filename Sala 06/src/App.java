import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> palavras = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite fim para parar!" + "\n" + "Digite uma palavra: ");

        while (true) {
            String palavra = sc.nextLine();

            if (palavra.equalsIgnoreCase("fim")) {
                break;
            }

            palavras.add(palavra);    
        }

        System.out.println("\n");
        System.out.println("Palavras digitadas: " + palavras.size());

        for (String palavra : palavras) {
            System.out.println(palavra);
        }

        Collections.sort(palavras);

        System.out.println("\nPalavras ordenadas: " + palavras.size());

        for (String palavra : palavras) {
            System.out.println(palavra);
        }
        sc.close();
    }
}
