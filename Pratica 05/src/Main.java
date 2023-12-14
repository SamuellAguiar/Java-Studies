/*
 * Grupo:
 * Samuell Carlos de Oliveira Aguiar - 21.2.8025
 * Gustavo Gomes Rolim - 21.2.8031
 */
import java.time.LocalDate;

public class Main {
        public static void main(String[] args) {

        Agenda agenda = new Agenda(10);
<<<<<<< HEAD
=======
        
>>>>>>> ef6018968b88a4a771fd31006dde6712e69b1e76
        Amigo amigo1 = new Amigo("Grolim", "Rua Sanitária", LocalDate.of(2000, 10, 10));
        Amigo amigo2 = new Amigo("Bielzin Du Mel", "Rua Dionísio", LocalDate.of(2000, 10, 10));
        Conhecido conhecido1 = new Conhecido("Samuell", "Rua Luiz Ferreira", "samuellcarlos@gmail.com");
        Conhecido conhecido2 = new Conhecido("Carlos", "Rua Cesário", "carlo@gmail.com");
        
        agenda.adicionarContato(amigo1);
        agenda.adicionarContato(amigo2);
        agenda.adicionarContato(conhecido1);
        agenda.adicionarContato(conhecido2);
            
        agenda.listarAmigos();
        agenda.listarConhecidos();
        }
}
