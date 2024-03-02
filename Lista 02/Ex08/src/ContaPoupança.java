public class ContaPoupança extends ContaBancaria{
    private double taxadeRendimento;

    public ContaPoupança(double saldo, double id, double taxadeRendimento) {
        super(saldo, id);
        this.taxadeRendimento = taxadeRendimento;        
    }

    public double getTaxadeRendimento() {
        return taxadeRendimento;
    }

    public void setTaxadeRendimento(double taxadeRendimento) {
        this.taxadeRendimento = taxadeRendimento;
    }
    
    public void tirarExtrato() {
        double calculo = this.getSaldo() * taxadeRendimento;
        System.out.println("Seu saldo atual é de -> R$" + calculo);
    }

}
