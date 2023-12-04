import java.time.LocalDate;

public class App {
        public static void main(String[] args) {

        Agenda agenda = new Agenda(10);

        agenda.adicionarContato(new Amigo("João", "20", LocalDate.of(2000, 10, 10)));
        agenda.adicionarContato(new Amigo("Maria", "20", LocalDate.of(2000, 10, 10)));
        agenda.adicionarContato(new Conhecido("José", "20", "samuellcarlos@gmail.com"));
        agenda.adicionarContato(new Conhecido("Ana", "20", "carlo@gmail.com"));

        agenda.listarContatos();
        agenda.listarAmigos();
        agenda.listarConhecidos();
    }
}
