import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int vet[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Insira o valor desejado: ");
            int x = sc.nextInt();
            vet[i] = x;
        }

        System.out.println("Valor inversa: ");
        for (int i = 9; i >= 0; i--) {
            System.out.println(vet[i]);
        }
        sc.close();
    }
}
