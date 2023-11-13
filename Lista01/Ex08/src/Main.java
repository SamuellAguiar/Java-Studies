public class Main {
    public static void main(String[] args) {
        Pais brasil = new Pais("BRA", "Brasil", 193946886, 8515767);
        Pais argentina = new Pais("ARG", "Argentina", 44938712, 2780400);
        Pais uruguai = new Pais("URY", "Uruguai", 3473727, 176215);
        Pais paraguai = new Pais("PRY", "Paraguai", 7052983, 406752);
    
        brasil.setVizinhos(new Pais[]{argentina, uruguai, paraguai});
    
        System.out.println("Densidade populacional do Brasil: " + brasil.densidadePopulacional());
    
        System.out.println("Brasil é limítrofe com a Argentina? " + brasil.isLimitrofe(argentina));
        System.out.println("Brasil é limítrofe com o Uruguai? " + brasil.isLimitrofe(uruguai));
        System.out.println("Brasil é limítrofe com o Paraguai? " + brasil.isLimitrofe(paraguai));
    
        System.out.println("Vizinhos do Brasil:");
        for (Pais vizinho : brasil.getVizinhos()) {
            if (vizinho != null) {
                System.out.println(vizinho.getNome());
            }
        }
    }
}
