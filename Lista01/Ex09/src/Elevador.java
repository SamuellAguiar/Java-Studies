public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

    public Elevador(int totalAndares, int capacidade) {
        this.andarAtual = 0;
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.pessoasPresentes = 0;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }

    public void entra() {
        if (this.pessoasPresentes < this.capacidade) {
            this.pessoasPresentes++;
        } else {
            System.out.println("Elevador cheio!");
        }
    }

    public void sai() {
        if (this.pessoasPresentes > 0) {
            this.pessoasPresentes--;
        } else {
            System.out.println("Elevador vazio!");
        }
    }

    public void sobe() {
        if (this.andarAtual < this.totalAndares) {
            this.andarAtual++;
        } else {
            System.out.println("Elevador no último andar!");
        }
    }

    public void desce() {
        if (this.andarAtual > 0) {
            this.andarAtual--;
        } else {
            System.out.println("Elevador no térreo!");
        }
    }

    public void status() {
        System.out.println("Andar atual: " + this.andarAtual);
        System.out.println("Total de andares: " + this.totalAndares);
        System.out.println("Capacidade: " + this.capacidade);
        System.out.println("Pessoas presentes: " + this.pessoasPresentes);
    }

    
    
}
