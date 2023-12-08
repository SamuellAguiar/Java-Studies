import java.time.LocalDate;

public class Amigo extends Contato{
    private LocalDate aniversario;

    public Amigo(String nome, String endereco, LocalDate aniversario) {
        super(nome, endereco);
        if(aniversario.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Data de aniversário inválida");
        }else{
            this.aniversario = aniversario;
        }
    }

    public LocalDate getAniversario() {
        return aniversario;
    }
    public void setAniversario(LocalDate aniversario) {
        this.aniversario = aniversario;
    }

    @Override
    public String toString() {
        return super.toString() + "Nome: " + super.getNome() + "Endereço: " + super.getEndereco() + super.toString() + "Aniversário: " + aniversario + "\n";
    }
}
