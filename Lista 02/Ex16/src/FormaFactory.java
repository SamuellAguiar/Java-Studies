public class FormaFactory {
    public static FormaGeometrica criar(String tipo) {
        if ("circulo".equalsIgnoreCase(tipo)) {
            return new Circulo();
        } else if ("quadrado".equalsIgnoreCase(tipo)) {
            return new Quadrado();
        }else if("triangulo".equalsIgnoreCase(tipo)){
            return new Triangulo();
        }
        throw new IllegalArgumentException("Tipo de forma desconhecido: " + tipo);
    }
}
