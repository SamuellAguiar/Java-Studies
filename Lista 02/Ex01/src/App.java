public class App {
    public static void main(String[] args) throws Exception {
        Ponto2D ponto1 = new Ponto2D(1, 1);
        Ponto2D ponto2 = new Ponto2D(2, 2);
        
        System.out.println("Distância entre ponto1 e ponto2: " + ponto1.distancia(ponto2));
        System.out.println("Distância entre ponto1 e origem: " + ponto1.distancia());
        
    }
}
