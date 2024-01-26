import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Empregado2 empregado1 = new Empregado2("Samuell", "Aguiar", 1500.00, LocalDate.of(2022, 1, 1));
        Empregado2 empregado2 = new Empregado2("João", "De Barro", 2000.00, LocalDate.of(2023, 2, 2));

        System.out.println(empregado1.getFirstName());
        System.out.println(empregado1.getLastName());
        System.out.println(empregado1.getSalarioMensal());
        System.out.println(empregado1.getDataContratacao());
        empregado1.salarioAnual();
        empregado1.aumento();

        System.out.println(" ");
        
        System.out.println(empregado2.getFirstName());
        System.out.println(empregado2.getLastName());
        System.out.println(empregado2.getSalarioMensal());
        System.out.println(empregado2.getDataContratacao());
        empregado2.salarioAnual();
        empregado2.aumento();

        System.out.println(" ");

        System.out.println("Numero de Empregados: " + Empregado2.getContador());
    }
}
