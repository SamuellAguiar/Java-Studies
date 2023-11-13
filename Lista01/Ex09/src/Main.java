public class Main {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(2, 3);

        elevador.entra(); // uma pessoa entrou no elevador
        elevador.sobe(); // o elevador sobe um andar
        elevador.status();
        System.out.println(" ");

        elevador.sai(); // uma pessoa saiu do elevador
        elevador.desce(); // o elevador desce um andar
        elevador.status(); // imprime o status do elevador
    }
}
