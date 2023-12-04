import java.time.LocalDate;

public class Amigo extends Contato{
    private LocalDate aniversario;

    public Amigo(String nome, String idade, LocalDate aniversario) {
        super(nome, idade);
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
}
