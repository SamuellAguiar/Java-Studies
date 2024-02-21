public class App {
    public static void main(String[] args) throws Exception {
        Ponto2D p1 = new Ponto2D(1, 1);
        Ponto2D p2 = new Ponto2D(2, 2);
        
        System.out.println(p1.distancia(p2));
        System.out.println(p1.distancia());

    }
}
