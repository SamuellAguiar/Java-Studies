class Onibus {
    private int numeroOnibus;
    private double quilometragemTotal;

    public Onibus(int numeroOnibus) {
        this.numeroOnibus = numeroOnibus;
        this.quilometragemTotal = 0.0;
    }

    public int getNumeroOnibus() {
        return numeroOnibus;
    }

    public double getQuilometragemTotal() {
        return quilometragemTotal;
    }

    public void adicionarQuilometragem(double quilometragem) {
        quilometragemTotal += quilometragem;
    }
}