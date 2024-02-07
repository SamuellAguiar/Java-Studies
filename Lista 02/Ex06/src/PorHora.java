public class PorHora extends Empregado{

    double valorHora;
    int numHoras;

    public PorHora(String name, double valorHora, int numHoras) {
        super(name);
        this.valorHora = valorHora;
        this.numHoras = numHoras;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public int getNumHoras() {
        return numHoras;
    }

    @Override
    public double getPay() {
        return valorHora * numHoras;
    }
    
}
