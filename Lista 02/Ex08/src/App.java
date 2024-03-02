public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria conta1 = new ContaBancaria(1000, 1);
        ContaBancaria conta2 = new ContaBancaria(2000, 2);
        ContaCorrente conta3 = new ContaCorrente(3000, 3, 1000);
        ContaCorrente conta4 = new ContaCorrente(4000, 4, 2000);
        ContaPoupança conta5 = new ContaPoupança(5000, 5, 0.1);
        ContaPoupança conta6 = new ContaPoupança(6000, 6, 0.2);
        Agencia agencia = new Agencia(6);
        agencia.addConta(conta1);
        agencia.addConta(conta2);
        agencia.addConta(conta3);
        agencia.addConta(conta4);
        agencia.addConta(conta5);
        agencia.addConta(conta6);
        System.out.println("Montante Conta Corrente: " + agencia.montanteContaCorrente());
        System.out.println("Montante Conta Poupança: " + agencia.montanteContaPoupanca());
        agencia.imprimeContas();
    }
}
