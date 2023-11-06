/*Imagine que você está criando um site, onde é necessário testar a idade do cliente para que ele possa ter acesso aos serviços disponíveis no sistema. 
Caso o cliente tenha 18 anos ou mais, é enviada uma mensagem de boas vindas ao cliente, caso contrário, 
é emitida uma mensagem informando que ele não pode acessar o sistema, pois sua idade é inferior a 18 anos. 
Faça o cãlculo da idade a partir da data atual e da data de nascimento.
Crie um programa, em linguagem java, que satisfaça as condições acima citadas. */

/*
Nosso grupo:
Samuell Carlos de Oliveira Aguiar -> 21.2.8025
Gabriel Roberto Cândido Nunes -> 21.2.8035c
 */
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("<------------------------------------------------------------------>");
        System.out.print("Digite sua data de nascimento (AAAA-MM-DD): ");

        String idade = scanner.nextLine();

        LocalDate birthDate = LocalDate.parse(idade);
        LocalDate currentDate = LocalDate.now();

        int age = Period.between(birthDate, currentDate).getYears();

        System.out.println("Sua idade é " + age + " anos.");
        
        if (age >= 18) {
            System.out.println("Bem-vindo ao sistema!");
        } else {
            System.out.println("Você não pode acessar o sistema, pois sua idade é inferior a 18 anos.");
        }

        scanner.close();
    }
}