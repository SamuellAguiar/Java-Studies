public class FolhadePagamento {
    public static void main(String[] args) {
        PorHora emp1 = new PorHora("João", 10, 40);
        PorComissao emp2 = new PorComissao("Maria", 1000);
        PorHoraeComissao emp3 = new PorHoraeComissao("José", 10, 40, 1000);
        System.out.println("O empregado " + emp1.name + " recebeu o pagamento de R$" + emp1.getPay());
        System.out.println("O empregado " + emp2.name + " recebeu o pagamento de R$" + emp2.getPay());
        System.out.println("O empregado " + emp3.name + " recebeu o pagamento de R$" + emp3.getPay());
    }
}
