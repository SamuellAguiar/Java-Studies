public class Invoice {
    private int numFatura;
    private String descricao;
    private int qtdComprada;
    private double precoItem;

    public Invoice(int numFatura, String descricao, int qtdComprada, double precoItem) {
        this.numFatura = numFatura;
        this.descricao = descricao;
        if (qtdComprada < 0) {
            this.qtdComprada = 0;
        } else {
            this.qtdComprada = qtdComprada;        
        }
        if(precoItem < 0){
            this.precoItem = 0.0;
        } else {
            this.precoItem = precoItem;
        }
        this.precoItem = precoItem;
    }

    public int getNumFatura() {
        return numFatura;
    }

    public void setNumFatura(int numFatura) {
        this.numFatura = numFatura;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdComprada() {
        return qtdComprada;
    }

    public void setQtdComprada(int qtdComprada) {
        this.qtdComprada = qtdComprada;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }
    
    public void getInvoiceAmount(){
        double fatura;
        fatura = this.qtdComprada * this.precoItem;
        System.out.println("Valor da fatura: " + fatura);
    }
}
