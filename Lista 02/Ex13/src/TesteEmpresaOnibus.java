public class TesteEmpresaOnibus {
    public static void main(String[] args) {
        EmpresaOnibus empresa = new EmpresaOnibus();
        
        // Cadastrando ônibus
        empresa.cadastrarOnibus(1);
        empresa.cadastrarOnibus(2);
        empresa.cadastrarOnibus(3);
        
        // Simulando quilometragem percorrida
        empresa.frota.get(0).adicionarQuilometragem(100);
        empresa.frota.get(1).adicionarQuilometragem(200);
        empresa.frota.get(2).adicionarQuilometragem(150);
        
        // Mostrando resultados
        System.out.println("Quilometragem total: " + empresa.calcularQuilometragemTotal());
        System.out.println("Maior quilometragem: " + empresa.maiorQuilometragem());
        System.out.println("Menor quilometragem: " + empresa.menorQuilometragem());
    }
}