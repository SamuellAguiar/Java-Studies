public class Administrador extends Empregado{
    private double ajudaDeCusto;

    public Administrador(String nome, int cpf, String email, int numSeccao, double salarioBase, double INSS, double ajudaDeCusto) {
        super(nome, cpf, email, numSeccao, salarioBase, INSS);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + this.ajudaDeCusto;
    }
}
