public abstract class Empregado {
    String name;

    public Empregado(String name) {
        this.name = name;
    }

    public void printPay() {
        System.out.println("O empregado " + name + " recebeu o pagamento");
    }

    public abstract double getPay();
}
