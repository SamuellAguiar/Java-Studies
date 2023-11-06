import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class teste {
    public static void main(String[] args) {
        List<Integer> teste = new ArrayList<Integer>();

        teste.add(5);
        teste.add(25);
        teste.add(10);
        teste.add(2);
        teste.add(21);
        teste.add(13);
        teste.add(51);
        teste.add(1);

        Collections.sort(teste);
        System.out.println("Ordem Crescente: " + " \n" + teste);

        Collections.sort(teste, Collections.reverseOrder());
        System.out.println("Ordem Inversa: " + " \n"+ teste);

    }
}
