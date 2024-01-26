public class Complexo {
    public float real;
    public float imaginario;

    public Complexo(float real, float imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    @Override
    public String toString() {
        return real + " + " + imaginario + "i";
    }
}