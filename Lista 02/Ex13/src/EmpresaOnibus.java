import java.util.ArrayList;

class EmpresaOnibus {
    ArrayList<Onibus> frota;

    public EmpresaOnibus() {
        frota = new ArrayList<>();
    }

    public void cadastrarOnibus(int numeroOnibus) {
        frota.add(new Onibus(numeroOnibus));
    }

    public double calcularQuilometragemTotal() {
        double total = 0.0;
        for (Onibus onibus : frota) {
            total += onibus.getQuilometragemTotal();
        }
        return total;
    }

    public double maiorQuilometragem() {
        double maior = Double.MIN_VALUE;
        for (Onibus onibus : frota) {
            if (onibus.getQuilometragemTotal() > maior) {
                maior = onibus.getQuilometragemTotal();
            }
        }
        return maior;
    }

    public double menorQuilometragem() {
        double menor = Double.MAX_VALUE;
        for (Onibus onibus : frota) {
            if (onibus.getQuilometragemTotal() < menor) {
                menor = onibus.getQuilometragemTotal();
            }
        }
        return menor;
    }
}
