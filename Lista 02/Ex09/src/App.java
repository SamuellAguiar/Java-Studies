public class App {
    public static void main(String[] args) {
        CartaoWeb[] cartoes = new CartaoWeb[3];
        cartoes[0] = new DiaDosNamorados("João");
        cartoes[1] = new Aniversario("Maria");
        cartoes[2] = new Natal("José");

        for (CartaoWeb cartao : cartoes) {
            cartao.showMessage();
        }
    }
}
