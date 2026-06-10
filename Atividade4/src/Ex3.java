import java.util.ArrayList;

public class Ex3 {
    public static void main(String[] args) {

        try {
            SistemaAlunos sistema = new SistemaAlunos();

            sistema.adicionarAluno(new Aluno("Ana", 20, "A1", "ADS", 8.5));
            sistema.adicionarAluno(new Aluno("Carlos", 18, "A2", "ADS", 6.0));
            sistema.adicionarAluno(new Aluno("Marina", 22, "A3", "Engenharia", 9.0));
            sistema.adicionarAluno(new Aluno("João", 21, "A4", "ADS", 7.5));

            
            System.out.println("Alunos filtrados:");
            ArrayList<Aluno> filtrados = sistema.filtrarAlunos("ADS", 20, 7.0);
            for (Aluno a : filtrados) {
                System.out.println(a);
            }

           
            System.out.println("\nBusca por matrícula:");
            System.out.println(sistema.buscarPorMatricula("A3"));

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}