public class FabricaFiat implements FabricaCarros {
    @Override
    public Sedan criarSedan() {
        return new Siena();
    }

    @Override
    public Popular criarPopular() {
        return new Palio();
    }
}