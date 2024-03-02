public class TestePatio {
    public static void main(String[] args) {
        Patio patio = new Patio();

        Deposito deposito1 = new Deposito();
        deposito1.adicionarCimento(100);
        deposito1.adicionarCal(200);
        deposito1.adicionarAreia(300);
        patio.adicionarDeposito(deposito1);

        Deposito deposito2 = new Deposito();
        deposito2.adicionarCimento(400);
        deposito2.adicionarCal(500);
        deposito2.adicionarAreia(600);
        patio.adicionarDeposito(deposito2);

        System.out.println("Total de cimento: " + patio.getTotalCimento());
        System.out.println("Total de cal: " + patio.getTotalCal());
        System.out.println("Total de areia: " + patio.getTotalAreia());
    }
}
