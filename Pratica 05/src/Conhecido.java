public class Conhecido extends Contato {
    private String email;

    public Conhecido(String nome, String endereco, String email) {
        super(nome, endereco);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Email inválido");
        }
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "Endereço: " + getEndereco()  + "Email: " + email + "\n";
    }
}
