public class Agenda {
    private Contato[] contatos;

    public Agenda(int maxContatos) {
        this.contatos = new Contato[maxContatos];
    }

    public void adicionarContato(Contato contato) {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                contatos[i] = contato;
                break;
            }
        }
    }

    public void removerContato(String nome) {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null && contatos[i].getNome().equals(nome)) {
                contatos[i] = null;
                break;
            }
        }
    }

    public void listarContatos() {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null) {
                System.out.println(contatos[i].getIdade() + " " + contatos[i].getNome());
            }
        }
    }

    public void listarAmigos() {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] instanceof Amigo) {
                System.out.println(contatos[i].getIdade() + " " + contatos[i].getNome() + " " + ((Amigo) contatos[i]).getAniversario());
            }
        }
    }

    public void listarConhecidos() {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] instanceof Conhecido) {
                System.out.println(contatos[i].getIdade() + " " + contatos[i].getNome() + " " + ((Conhecido) contatos[i]).getEmail());
            }
        }
    }
}