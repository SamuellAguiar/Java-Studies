public class App {
    public static void main(String[] args) throws Exception {
        Date data = new Date(2022, 1, 1);
        System.out.println("Data: " + data);

        data.nextDay();
        System.out.println("Próximo dia: " + data);
    }
}
