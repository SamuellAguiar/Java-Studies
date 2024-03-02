public class Main {
    public static void main(String[] args) {
        FabricaCarros fabricaFiat = new FabricaFiat();
        Sedan sedanFiat = fabricaFiat.criarSedan();
        Popular popularFiat = fabricaFiat.criarPopular();

        sedanFiat.exibirInfo();
        popularFiat.exibirInfo();

        FabricaCarros fabricaFord = new FabricaFord();
        Sedan sedanFord = fabricaFord.criarSedan();
        Popular popularFord = fabricaFord.criarPopular();

        sedanFord.exibirInfo();
        popularFord.exibirInfo();
    }
}