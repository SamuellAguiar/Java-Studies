import java.util.ArrayList;
import java.util.List;

public class Patio {
    private List<Deposito> depositos = new ArrayList<>();

    public void adicionarDeposito(Deposito deposito) {
        depositos.add(deposito);
    }

    public int getTotalCimento() {
        return depositos.stream().mapToInt(Deposito::getCimento).sum();
    }

    public int getTotalCal() {
        return depositos.stream().mapToInt(Deposito::getCal).sum();
    }

    public int getTotalAreia() {
        return depositos.stream().mapToInt(Deposito::getAreia).sum();
    }   
}
