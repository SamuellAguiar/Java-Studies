/*Escreva um programa para ler números inteiros de 0 a 100. 
A leitura deve ser encerrada ao ler um número inválido( < 0 ou > 100).
Qual é o maior e o menor?*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int maiorNum = -1;
        int menorNum = 101;

        while (true) {
            System.out.print("Digite um número entre 0 e 100 (-1 para encerrar): ");
            int numero = sc.nextInt();

            if (numero < 0 || numero > 100) {
                if (numero == -1) {
                    break; // Encerra o loop quando -1 é digitado
                } else {
                    System.out.println("Número inválido! Por favor, digite um número entre 0 e 100.");
                }
            } else {
                // Atualiza o maior e o menor, se necessário
                if (numero > maiorNum) {
                    maiorNum = numero;
                }
                if (numero < menorNum) {
                    menorNum = numero;
                }
            }
        }

        if (maiorNum == -1 || menorNum == 101) {
            System.out.println("Nenhum número válido foi digitado.");
        } else {
            System.out.println("Maior número digitado: " + maiorNum);
            System.out.println("Menor número digitado: " + menorNum);
        }

        sc.close();
    }
}
