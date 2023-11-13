public class Main {
     public static void main(String[] args) {
        Reta reta1 = new Reta(2, 3);
        Reta reta2 = new Reta(2, 5);

        System.out.println("Reta 1: " + reta1);
        System.out.println("Reta 2: " + reta2);

        System.out.println("Interseção: " + reta1.intersecao(reta2));

        reta2.setA(3);
        System.out.println("Reta 2 após alteração: " + reta2);
        System.out.println("Interseção após alteração: " + reta1.intersecao(reta2));
    }
}
