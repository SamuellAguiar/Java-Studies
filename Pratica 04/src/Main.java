/*
 * Grupo:
 * Samuell Carlos de Oliveira Aguiar - 21.2.8025
 * Gustavo Gomes Rolim - 21.2.8031
 */

public class Main {
        public static void main(String[] args) {
                Curso curso = new Curso(1, "Sistemas de Informação", 10);

                Disciplina disciplina = new Disciplina(1, "Programação de Computadores II", 60);

                Aluno aluno = new Aluno("Samuell Aguiar", "Rua Luiz Ferreira, 63", "31982089884", "15086106656",
                                "2128025",
                                curso);
                disciplina.add(aluno);

                Aluno aluno2 = new Aluno("Gustavo Rolim", "Rua Luiz Ferreira, 63", "31982089884", "15086106656",
                                "2128025",
                                curso);
                disciplina.add(aluno2);

                Professor professor = new Professor("Gilda", "Rua B, 456", "987654321", "10987654321", "12345678901",
                                5000.0,
                                "Doutorado", "Engenharia de Software");

                TecnicoAdministrativo tecnico = new TecnicoAdministrativo("José", "Rua C, 789", "456789123",
                                "21098765432",
                                "12345678901", 2500.0);

                System.out.println(
                                "|--------------------------------------------------Bem-vindo(a)--------------------------------------------------|");
                
                System.out.println("Curso: " + curso.getNome() + ", Código: " + curso.getCodigo());
                System.out.println("            ");
                
                System.out.println("Aluno: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula() + ", Curso: "
                               + aluno.getCurso().getNome());

                System.out.println("            ");
                System.out.println("Professor: " + professor.getNome() + ", Titulação: " + professor.getTitulacao()
                                + ", Área de Pesquisa: " + professor.getAreaPesquisa());

                System.out.println("            ");
                System.out.println(
                                "Técnico Administrativo: " + tecnico.getNome() + ", Salário: " + tecnico.getSalario()
                                                + ", CPF: " + tecnico.getCpf());

                System.out.println("            ");
                System.out.println("Aluno: " + aluno2.getNome() + ", Matrícula: " + aluno2.getMatricula() + ", Curso: "
                                + aluno2.getCurso().getNome());

                System.out.println("            ");
                System.out.println("Lista de Alunos nas disciplinas:");

                System.out.println("            ");
                System.out.println("Disciplina: " + disciplina.getNome());

                System.out.println("            ");
                for (Aluno alunos : disciplina.getAlunos()) {
                        System.out.println("Aluno -> " + alunos.getNome());
                }

                System.out.println("|----------------------------------------------------------------------------------------------------------------|");
        }
}