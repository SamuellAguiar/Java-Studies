public class Deposito {
    private int cimento, cal, areia;

    public Deposito(int cimento, int cal, int areia) {
        this.cimento = cimento;
        this.cal = cal;
        this.areia = areia;
    }

    public Deposito(){}

    public int getCimento() {
        return cimento;
    }

    public void setCimento(int cimento) {
        this.cimento = cimento;
    }

    public int getCal() {
        return cal;
    }

    public void setCal(int cal) {
        this.cal = cal;
    }

    public int getAreia() {
        return areia;
    }

    public void setAreia(int areia) {
        this.areia = areia;
    }

    public void adicionarCimento(int quantidade) {
        cimento += quantidade;
    }

    public void adicionarCal(int quantidade) {
        cal += quantidade;
    }

    public void adicionarAreia(int quantidade) {
        areia += quantidade;
    }

    public void retirarCimento(int quantidade) {
        cimento -= quantidade;
    }

    public void retirarCal(int quantidade) {
        cal -= quantidade;
    }

    public void retirarAreia(int quantidade) {
        areia -= quantidade;
    }
}
