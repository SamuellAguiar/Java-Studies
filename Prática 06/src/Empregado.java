import java.time.LocalDate;


public class Empregado implements Comparable<Empregado> {
    private int ID;
    private String nome;
    private double salario;
    private LocalDate dataContratacao;

    public Empregado(int ID, String nome, double salario, LocalDate dataContratacao){
        this.ID = ID;
        this.nome = nome;
        this.salario = salario;
        if(dataContratacao.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Data de contratação inválida");
        }
        else{
            this.dataContratacao = dataContratacao;
        }
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        if(dataContratacao.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Data de contratação inválida");
        }
        else{
            this.dataContratacao = dataContratacao;
        }
    }

    @Override
    public int compareTo(Empregado outroEmpregado) {
        if (this.salario > outroEmpregado.salario) {
            return +1;
        }
        if (this.salario < outroEmpregado.salario) {
            return -1;
        }
        return 0;
    }
}
