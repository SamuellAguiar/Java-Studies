public class PorComissao extends Empregado implements Commission {
    private double sales;

    public PorComissao(String name, double sales) {
        super(name);
        this.sales = sales;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    @Override
    public void setVendas(double sales) {
        this.sales = sales;
    }

    @Override
    double getPay() {
        return this.sales * Comission_RATE;
    }
    
}
