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
<<<<<<< HEAD
        return super.toString() + "Nome: " + super.getNome() + "Idade" + super.getEndereco() + "Aniversário: " + aniversario + "\n";
=======
        return "Nome: " + getNome() + "Endereço: " + getEndereco() +  "Aniversário: " + aniversario + "\n";
>>>>>>> ef6018968b88a4a771fd31006dde6712e69b1e76
    }
}
