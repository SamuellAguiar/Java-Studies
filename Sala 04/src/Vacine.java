import java.time.LocalDate;

public class Vacine {
    private String name;
    private LocalDate dataAplicacao;
    private LocalDate validade;
    private int lote;
    private String nomeEmpresa;

    public Vacine(String name, LocalDate dataAplicacao, LocalDate validade, int lote, String nomeEmpresa) {
        this.name = name;
        this.lote = lote;
        this.nomeEmpresa = nomeEmpresa;
        if(dataAplicacao.isAfter(LocalDate.now())){
            this.dataAplicacao = dataAplicacao;
        }else{
            System.out.println("Data de aplicação inválida");
        }
        if (dataAplicacao.isBefore(validade)) {
            this.validade = validade;
        } else {
            System.out.println("Data de validade inválida");
        }
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