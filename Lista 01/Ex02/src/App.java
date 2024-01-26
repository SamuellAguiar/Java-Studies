public class App {
    public static void main(String[] args) throws Exception {
        Invoice invoice = new Invoice(1, "Descrição", 10, 10.0);
        invoice.getInvoiceAmount();
        System.out.println(invoice.getDescricao());
        System.out.println(invoice.getNumFatura());
        System.out.println(invoice.getPrecoItem());
        System.out.println(invoice.getQtdComprada());
        invoice.setDescricao("Descrição alterada");
    }
}
