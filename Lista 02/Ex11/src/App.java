import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        String[] vetor = new String[5];

        // Preencha o vetor com valores do usuário
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor para a posição " + (i + 1) + ": ");
            vetor[i] = scanner.nextLine();
        }

        // Realize uma busca no vetor
        while (true) {
            try {
                System.out.print("Digite a posição que deseja pesquisar: ");
                int posicao = scanner.nextInt();

                String valor = vetor[posicao - 1];
                char quintoCaracter = valor.charAt(4);

                System.out.println("A string na posição " + posicao + " é " + valor +
                        " e o quinto caracter é " + quintoCaracter);
            } catch (NumberFormatException e) {
                System.out.println("Erro: A posição deve ser um número inteiro");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Erro: A posição deve estar entre 1 e 5");
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Erro: A string deve ter pelo menos 5 caracteres");
            } catch (Exception e) {
                System.out.println("Erro desconhecido: " + e.getMessage());
            }
        }
    }
}