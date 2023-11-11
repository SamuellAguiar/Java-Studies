import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Vacine covid = new Vacine("Covid-19", LocalDate.of(2022, 12, 31), LocalDate.of(2023, 12, 31), 123, "Pfizer");
        System.out.println(covid.getName());
        System.out.println(covid.getDataAplicacao());
        System.out.println(covid.getValidade());
        System.out.println(covid.getLote());
        System.out.println(covid.getNomeEmpresa());
    }

}
