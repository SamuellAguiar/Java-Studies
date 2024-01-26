public class App {
    public static void main(String[] args) throws Exception {
        Reta reta1 = new Reta(1, 1, 2, 2);
        Reta reta2 = new Reta(2, 2, 3, 3);

        System.out.println("Distância entre reta1 e reta2: " + reta1.distancia(reta2));
        System.out.println("Distância entre reta1 e origem: " + reta1.distancia());
    }
}
