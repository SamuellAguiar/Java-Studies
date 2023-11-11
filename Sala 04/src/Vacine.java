import java.time.LocalDate;

public class Vacine {
    private String name;
    private LocalDate dataAplicacao;
    private LocalDate validade;
    private int lote;
    private String nomeEmpresa;

    public Vacine(String name, LocalDate dataAplicacao, LocalDate validade, int lote, String nomeEmpresa) {
        this.name = name;
        this.dataAplicacao = dataAplicacao;
        this.validade = validade;
        this.lote = lote;
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(LocalDate dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
    
}