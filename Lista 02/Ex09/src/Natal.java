public class Natal extends CartaoWeb{
    public Natal(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz Natal, " + this.getDestinatario() + "!!!");
    }
}
