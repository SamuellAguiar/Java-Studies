public class PorHoraeComissao extends PorHora{
    private double sales;
    public PorHoraeComissao(String name, double valorHora, int numHoras, double sales) {
        super(name, valorHora, numHoras);
        this.sales = sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getSales() {
        return sales;
    }

    public void setVendas(double sales) {
        this.sales = sales;
    }

    @Override
    public double getPay() {
        return super.getPay() + sales * 0.15;
    }

    @Override
    public void printPay() {
        System.out.println("O empregado " + name + " recebeu o pagamento de R$" + getPay());
    }
}
