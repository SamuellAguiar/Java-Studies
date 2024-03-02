public class FabricaFord implements FabricaCarros {
    @Override
    public Sedan criarSedan() {
        return new FiestaSedan();
    }

    @Override
    public Popular criarPopular() {
        return new Fiesta();
    }
}