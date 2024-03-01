public abstract class Empregado {
    private String name;

    public Empregado(String name) {
        this.name = name;
    }

    public void printPay(){
        System.out.println("O pagamento do empregado " + this.name + " é: " + this.getPay());
    }
    

    abstract double getPay();
}
