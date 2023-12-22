/*
 * Grupo:
 * Samuell Carlos de Oliveira Aguiar - 21.2.8025
 * Gustavo Gomes Rolim - 21.2.8031
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> palavras = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra: " + " " + "Digite fim para parar");

        while (true) {
            String palavra = sc.nextLine();

            if (palavra.equalsIgnoreCase("fim")) {
                break;
            }

            palavras.add(palavra);    
        }

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
