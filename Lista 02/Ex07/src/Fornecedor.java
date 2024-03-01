public class Fornecedor extends Pessoa{
    private double cred;
    private double valorEmDivida;

    public Fornecedor(String nome, String email, int cpf, double cred, double valorEmDivida) {
        super(nome, cpf, email);
        this.cred = cred;
        this.valorEmDivida = valorEmDivida;
    }

    public double getCred() {
        return cred;
    }

    public void setCred(double cred) {
        this.cred = cred;
    }

    public double getValorEmDivida() {
        return valorEmDivida;
    }

    public void setValorEmDivida(double valorEmDivida) {
        this.valorEmDivida = valorEmDivida;
    }

    public double obterSaldo() {
        return this.cred - this.valorEmDivida;
    }

}
