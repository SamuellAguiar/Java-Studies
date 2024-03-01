public class Operario extends Empregado{
    private double valorProducao;
    private double comissao;

    public Operario(String nome, int cpf, String email, int numSeccao, double salarioBase, double INSS, double valorProducao, double comissao) {
        super(nome, cpf, email, numSeccao, salarioBase, INSS);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (this.valorProducao * this.comissao);
    }
}
