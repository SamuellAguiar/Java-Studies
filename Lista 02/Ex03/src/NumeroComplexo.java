public class NumeroComplexo {
    private double real;
    private double imaginario;

    public NumeroComplexo(double real, double imaginario){
        this.real = real;
        this.imaginario = imaginario;
    }

    public NumeroComplexo(double real){
        this.real = real;
        this.imaginario = 0.0;
    }

    public NumeroComplexo(){
        this.real = 0.0;
        this.imaginario = 0.0;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }

    
}
