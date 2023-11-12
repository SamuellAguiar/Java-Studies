public class Calculadora {
    public float soma(float valor1, float valor2) {
        return valor1 + valor2;
    }

    public float subtracao(float valor1, float valor2) {
        return valor1 - valor2;
    }

    public float multiplicacao(float valor1, float valor2) {
        return valor1 * valor2;
    }

    public float divisao(float valor1, float valor2) {
        if (valor2 != 0) {
            return valor1 / valor2;
        } else {
            throw new IllegalArgumentException("Divisor não pode ser zero");
        }
    }
}