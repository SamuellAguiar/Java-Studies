import java.time.LocalDate;

public class Date {
    private LocalDate data;
    
    public Date(int ano, int mes, int dia) {
        this.data = LocalDate.of(ano, mes, dia);
    }

    public Date(){
        this.data = LocalDate.now();
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data.toString();
    }

    public void nextDay(){
        data = data.plusDays(1);
    }
}