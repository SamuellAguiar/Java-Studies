public class ContaBancaria {
    private double saldo;
    private double id;

    public ContaBancaria(double saldo, double id) {
        this.saldo = saldo;
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public void sacar(double valor) {
        if (valor > this.saldo) {
            System.out.println("Valor não pode ser sacado!!!");
        } else {
            System.out.println("Saque realizado com sucesso!!!");
            this.saldo -= valor;
        }
    }

    public void depositar(double valor) {
        if (valor < this.saldo) {
            System.out.println("Valor não pode ser depositado!!!");
        } else {
            System.out.println("Depósito realizado com sucesso!!!");
            this.saldo += valor;
        }
    }

    public void tirarExtrato() {
        System.out.println("Seu saldo atual é de -> R$" + this.saldo);
    }
}
