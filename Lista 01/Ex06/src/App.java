public class App {
    public static void main(String[] args) {
        Calculadora2 calc = new Calculadora2();

        Complexo c1 = new Complexo(2, 3);
        Complexo c2 = new Complexo(7, 1);
        System.out.println("Soma: " + calc.soma(c1, c2));  // Deve imprimir: Soma: 9.0 + 4.0i

        c1 = new Complexo(5, 4);
        c2 = new Complexo(2, 2);
        System.out.println("Multiplicação: " + calc.multiplicacao(c1, c2));  // Deve imprimir: Multiplicação: 2.0 + 18.0i

        c1 = new Complexo(3, 1);
        c2 = new Complexo(4, 2);
        System.out.println("Divisão: " + calc.divisao(c1, c2));  // Deve imprimir: Divisão: 0.7 + 0.1i
    }
}
