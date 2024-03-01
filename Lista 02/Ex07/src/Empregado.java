public class Empregado extends Pessoa{
    private int numSeccao;
    private double salarioBase;
    private double INSS;

    public Empregado(String nome, int cpf, String email, int numSeccao, double salarioBase, double INSS) {
        super(nome, cpf, email);
        this.numSeccao = numSeccao;
        this.salarioBase = salarioBase;
        this.INSS = INSS;
    }

    public int getNumSeccao() {
        return numSeccao;
    }

    public void setNumSeccao(int numSeccao) {
        this.numSeccao = numSeccao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getINSS() {
        return INSS;
    }

    public void setINSS(double iNSS) {
        INSS = iNSS;
    }
    
    public double calcularSalario() {
        return this.salarioBase - (this.salarioBase * this.INSS);
    }
}
