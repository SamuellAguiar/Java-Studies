public class Calculadora2 {
    public Complexo soma(Complexo c1, Complexo c2) {
        return new Complexo(c1.real + c2.real, c1.imaginario + c2.imaginario);
    }

    public Complexo multiplicacao(Complexo c1, Complexo c2) {
        return new Complexo(c1.real * c2.real - c1.imaginario * c2.imaginario,
                c1.real * c2.imaginario + c1.imaginario * c2.real);
    }

    public Complexo divisao(Complexo c1, Complexo c2) {
        float divisor = c2.real * c2.real + c2.imaginario * c2.imaginario;
        return new Complexo((c1.real * c2.real + c1.imaginario * c2.imaginario) / divisor,
                (c1.imaginario * c2.real - c1.real * c2.imaginario) / divisor);
    }
}