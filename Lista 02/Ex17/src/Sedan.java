public interface Sedan extends Carro {
    @Override
    default void exibirInfo() {
        System.out.println("Carro Sedan");
    }
}