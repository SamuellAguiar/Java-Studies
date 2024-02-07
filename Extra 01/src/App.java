public class App {
    public static void main(String[] args) throws Exception {
        PrimeiroGrau eq1 = new PrimeiroGrau(2, 3, 4);
        System.out.println(eq1);
        System.out.println("Valor de y: " + eq1.valorY());

        SegundoGrau eq2 = new SegundoGrau(2, 3, 4, 5);
        System.out.println(eq2);
        System.out.println("Valor de y: " + eq2.valorY());
    }
}
