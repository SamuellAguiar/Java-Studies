import java.time.LocalDate;

public class Empregado2 {
    private static int contador = 0;
    private String firstName;
    private String lastName;
    private double salarioMensal;
    private LocalDate dataContratacao;

    public Empregado2(String firstName, String lastName, double salarioMensal, LocalDate dataContratacao) {
        this.firstName = firstName;
        this.lastName = lastName;
        if(salarioMensal < 0.0){
            this.salarioMensal = 0.0;
        }else{
            this.salarioMensal = salarioMensal;
        }
        if(dataContratacao.isAfter(LocalDate.now())){
            this.dataContratacao = LocalDate.now();
        } else {
            this.dataContratacao = dataContratacao;
        }
        contador++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public void salarioAnual(){
        double conta = salarioMensal * 12;

        System.out.println("Salario Anual: " + conta);
    }
    
    public void aumento(){
        double aumento = (salarioMensal * 12) + (salarioMensal *12 * 0.10);

        System.out.println("Salário com aumento: " + aumento);
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Empregado2.contador = contador;
    }

}
