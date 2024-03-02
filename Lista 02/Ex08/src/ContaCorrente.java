public class ContaCorrente extends ContaBancaria{
    private double limiteChequeEspecial;

    public ContaCorrente(double saldo, double id, double limiteChequeEspecial) {
        super(saldo, id);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void sacar(double valor){
    
        if(valor > this.getSaldo() || valor > this.limiteChequeEspecial){
            System.out.println("Valor não pode ser sacado!!!");
        }

        else{
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque realizado com sucesso!!!");
        }
    }

    public void depositar(double valor){
    
        if(valor < this.getSaldo()){
            System.out.println("Valor não pode ser sacado!!!");
        }
    
        else{
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Deposito realizado com sucesso!!!");
        }
    }

    public void tirarExtrato(){
    
        System.out.println("Seu valor de cheque especial é de -> R$" + this.limiteChequeEspecial);
    
        System.out.println("O saldo da sua conta é de -> R$" + this.getSaldo());
    
        System.out.println("Seu saldo total é de -> R$" + (this.limiteChequeEspecial + this.getSaldo()));
    
    }
}
