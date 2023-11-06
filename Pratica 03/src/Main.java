/*
 * Grupo:
 * Samuell Carlos de Oliveira Aguiar - 21.2.8025
 * Gustavo Gomes Rolim - 21.2.8031
 */
public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso(1, "Sistemas de Informação", 10);
        Disciplina disciplina = new Disciplina(1, "Programação de Computadores II", 60);
        Aluno aluno = new Aluno("Samuell Aguiar", "Rua Luiz Ferreira, 63", "31982089884", "15086106656", "2128025", curso);
        Professor professor = new Professor("Gilda", "Rua B, 456", "987654321", "10987654321", "12345678901", 5000.0, "Doutorado", "Engenharia de Software");
        TecnicoAdministrativo tecnico = new TecnicoAdministrativo("José", "Rua C, 789", "456789123", "21098765432", "12345678901", 2500.0);

        System.out.println("Disciplina: " + disciplina.getNome() + ", Carga Horária: " + disciplina.getCargaHoraria() + " horas");
        System.out.println("Aluno: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula() + ", Curso: " + aluno.getCurso().getNome());
        System.out.println("Professor: " + professor.getNome() + ", Titulação: " + professor.getTitulacao() + ", Área de Pesquisa: " + professor.getAreaPesquisa());
        System.out.println("Técnico Administrativo: " + tecnico.getNome() + ", Salário: " + tecnico.getSalario());
    }
}