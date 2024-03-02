public interface Popular extends Carro {
    @Override
    default void exibirInfo() {
        System.out.println("Carro Popular");
    }
}