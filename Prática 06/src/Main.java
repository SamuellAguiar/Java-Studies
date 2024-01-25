import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empregado> empregados = new ArrayList<Empregado>();
        Scanner sc = new Scanner(System.in);

        empregados.add(new Empregado(1, "João", 1500, LocalDate.of(2003, 1, 21)));
        empregados.add(new Empregado(2, "Maria", 2000, LocalDate.of(2003, 4, 15)));
        empregados.add(new Empregado(3, "José", 2500, LocalDate.of(2005, 10, 3)));
        empregados.add(new Empregado(4, "Ana", 3000, LocalDate.of(1998, 9, 21)));
        empregados.add(new Empregado(5, "Carlos", 3500, LocalDate.of(2006, 2, 10)));
        empregados.add(new Empregado(6, "Mariana", 4000, LocalDate.of(2000, 5, 24)));

        System.out.println(" ");
        System.out.println("Questão i: \n");
        System.out.println("Empregados ordenados por Salário:");

        Collections.sort(empregados, Comparator.comparing(Empregado::getSalario));

        for (Empregado empregado : empregados) {
            System.out.println(empregado.getNome() + " -> " + empregado.getSalario());
        }

        Empregado maiorSalario = Collections.max(empregados, Comparator.comparing(Empregado::getSalario));

        Empregado menorSalario = Collections.min(empregados, Comparator.comparing(Empregado::getSalario));

        System.out.println(" ");
        System.out.println("Questão ii: \n");
        System.out
                .println("Empregado com maior salário: " + maiorSalario.getNome() + " -> " + maiorSalario.getSalario());

        System.out
                .println("Empregado com menor salário: " + menorSalario.getNome() + " -> " + menorSalario.getSalario());

        System.out.println(" ");
        System.out.println("Questão iii: \n");
        Empregado maisAntigo = Collections.min(empregados, Comparator.comparing(Empregado::getDataContratacao));

        Empregado maisNovo = Collections.max(empregados, Comparator.comparing(Empregado::getDataContratacao));

        System.out.println("Empregado mais antigo: " + maisAntigo.getNome() + " -> " + maisAntigo.getDataContratacao());

        System.out.println("Empregado mais novo: " + maisNovo.getNome() + " -> " + maisNovo.getDataContratacao());

        System.out.println(" ");
        System.out.println("Questão iv: \n");

        try {
            System.out.println("Insira quantos indices deseja inserir: ");
            int num = sc.nextInt();
            for (int i = 0; i < num; i++) {
                System.out.println("Insira o Indice do Empregado desejado:(Lembre-se, sempre começa do 0'Zero')");
                int index = sc.nextInt();
                Empregado empregado = empregados.get(index);

                System.out.println("Empregado escolhido: " + empregado.getNome() + " -> " + empregado.getID());
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Indice inválido!");
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida!");
        } catch (RuntimeException e) {
            System.out.println("Erro desconhecido!" + e.getMessage());
        } finally {
            sc.close();
        }

    }
}
