public class PorComissao extends Empregado implements Commission{

    double sales;

    public PorComissao(String name, double sales) {
        super(name);
        this.sales = sales;
    }

    @Override
    public double setVendas(double sales) {
        this.sales = sales;
        return sales;
    }

    @Override
    public double getPay() {
        return sales * 0.15;
    }
    
}
