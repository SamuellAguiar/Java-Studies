public class App {
    public static void main(String[] args) throws Exception {
        NumeroComplexo numero1 = new NumeroComplexo(1, 1);
        NumeroComplexo numero2 = new NumeroComplexo( 2);
        NumeroComplexo numero3 = new NumeroComplexo();
        
        System.out.println("Numero 1: " + numero1.getReal() + " + " + numero1.getImaginario() + "i");

        System.out.println("Numero 2: " + numero2.getReal() + " + " + numero2.getImaginario() + "i");   

        System.out.println("Numero 3: " + numero3.getReal() + " + " + numero3.getImaginario() + "i");
    }
}
