public class Pais{
    private String codigoISO;
    private String nome;
    private double população;
    private double dimensao;
    private Pais[] vizinhos = new Pais[3];

    public Pais(String codigoISO, String nome, double população, double dimensao){
        this.codigoISO = codigoISO;
        this.nome = nome;
        this.população = população;
        this.dimensao = dimensao;
    }

    public String getCodigoISO() {
        return codigoISO;
    }

    public void setCodigoISO(String codigoISO) {
        this.codigoISO = codigoISO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPopulação() {
        return população;
    }

    public void setPopulação(double população) {
        this.população = população;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public Pais[] getVizinhos() {
        return vizinhos;
    }

    public void setVizinhos(Pais[] vizinhos) {
        this.vizinhos = vizinhos;
    }

    public boolean isLimitrofe(Pais outroPais) {
        for (Pais vizinho : vizinhos) {
            if (vizinho != null && vizinho.getCodigoISO().equals(outroPais.getCodigoISO())) {
                return true;
            }
        }
        return false;
    }

    public double densidadePopulacional() {
        return população / dimensao;
    }
}