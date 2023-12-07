import java.time.LocalDate;

public class Main {
        public static void main(String[] args) {

        Agenda agenda = new Agenda(10);
        Amigo amigo1 = new Amigo("João", "20", LocalDate.of(2000, 10, 10));
        Amigo amigo2 = new Amigo("Maria", "20", LocalDate.of(2000, 10, 10));
        Conhecido conhecido1 = new Conhecido("José", "20", "samuellcarlos@gmail.com");
        Conhecido conhecido2 = new Conhecido("Ana", "20", "carlo@gmail.com");
        
        agenda.adicionarContato(amigo1);
        agenda.adicionarContato(amigo2);
        agenda.adicionarContato(conhecido1);
        agenda.adicionarContato(conhecido2);
            
        agenda.listarContatos();
        agenda.listarAmigos();
        agenda.listarConhecidos();
        }
}
