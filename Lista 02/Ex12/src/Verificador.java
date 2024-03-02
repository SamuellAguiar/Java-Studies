public class Verificador {
    public static class NaoEhLetraException extends Exception {
        public NaoEhLetraException(String message) {
            super(message);
        }
    }

    public static class NaoEhMaiusculaException extends Exception {
        public NaoEhMaiusculaException(String message) {
            super(message);
        }
    }

    public void verificar(String str) throws NaoEhLetraException, NaoEhMaiusculaException {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (!Character.isLetter(c)) {
                throw new NaoEhLetraException("O caracter na posição " + (i + 1) + " não é uma letra");
            }

            if (!Character.isUpperCase(c)) {
                throw new NaoEhMaiusculaException("A letra na posição " + (i + 1) + " não é maiúscula");
            }
        }
    }
}
