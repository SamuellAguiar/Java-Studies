public class PorHoraeComissao extends PorHora implements Commission{
    private double sales;

    public PorHoraeComissao(String name, double valorHora, int numHora, double sales) {
        super(name, valorHora, numHora);
        this.sales = sales;
    }

    @Override
    public void setVendas(double sales) {
        this.sales = sales;
    }

    @Override
    double getPay() {
        return super.getPay() + this.sales * Comission_RATE;
    }

}
