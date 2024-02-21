public class App {
    public static void main(String[] args) throws Exception {
        NumeroComplexo n1 = new NumeroComplexo(1, 2);
        NumeroComplexo n2 = new NumeroComplexo(3, 4);
    
        System.out.println(n1);
        System.out.println(n2);

        n1.setReal(5);
        n1.setImaginario(6);
        System.out.println(n1);

        n2.setReal(7);
        n2.setImaginario(8);
        System.out.println(n2);
        System.out.println(n1.toString());
        System.out.println(n2.toString());
    }
}
