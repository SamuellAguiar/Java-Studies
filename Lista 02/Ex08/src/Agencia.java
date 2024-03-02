public class Agencia {
    private ContaBancaria[] conta;
    private int indice = 0;

    public Agencia(int indice) {
        this.conta = new ContaBancaria[indice];
    }

    public ContaBancaria[] getConta() {
        return conta;
    }

    public void setConta(ContaBancaria[] conta) {
        this.conta = conta;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public void addConta(ContaBancaria contas){
        if(indice < this.conta.length){
            this.conta[indice] = contas;
            indice++;
        }
        else{
            System.out.println("Capacidade máxima atingida!!!");
        }
    }

    public double montanteContaCorrente(){
        double total = 0;
        for(ContaBancaria contas : conta){
            if (contas instanceof ContaCorrente) {
                total += contas.getSaldo();
            }
        }
        return total;
    }

    public double montanteContaPoupanca(){
        double total = 0;
        for(ContaBancaria contas : conta){
            if(contas instanceof ContaPoupança){
                total += contas.getSaldo();
            }
        }
        return total;
    }
    
    public void imprimeContas(){
        for(ContaBancaria contas : conta){
            if(contas != null){
                System.out.println("ID -> "+ contas.getId() + " || Saldo -> " + contas.getSaldo());
            }
        }
    }
}
