public class App {
    public static void main(String[] args) {
    Calculadora calc = new Calculadora();

        System.out.println("Soma: " + calc.soma(10, 5));  // Deve imprimir: Soma: 15.0
        System.out.println("Subtração: " + calc.subtracao(10, 5));  // Deve imprimir: Subtração: 5.0
        System.out.println("Multiplicação: " + calc.multiplicacao(10, 5));  // Deve imprimir: Multiplicação: 50.0
        System.out.println("Divisão: " + calc.divisao(10, 5));  // Deve imprimir: Divisão: 2.0
    }
}
