public class FolhadePagamento {
    public static void main(String[] args) {

        PorComissao p1 = new PorComissao("João", 1000);

        p1.printPay();
        p1.setSales(2000);
        p1.printPay();

        PorHora p2 = new PorHora("Maria", 10, 40);

        p2.printPay();
        p2.setNumHora(50);
        p2.printPay();

        PorHoraeComissao p3 = new PorHoraeComissao("José", 10, 40, 1000);
        
        p3.printPay();
        p3.setVendas(2000);
        p3.setNumHora(50);
        p3.printPay();

    }
}
