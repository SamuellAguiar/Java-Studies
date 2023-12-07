public class Conhecido extends Contato {
    private String email;

    public Conhecido(String nome, String idade, String email) {
        super(nome, idade);
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
        return super.toString() + "Nome: " + super.getNome() + "Idade" + super.getIdade() + super.toString() + "Email: " + email + "\n";
    }
}
