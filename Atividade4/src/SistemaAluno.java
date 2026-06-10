import java.util.ArrayList;

public class SistemaAlunos {

    private ArrayList<Aluno> alunos;

    public SistemaAlunos() {
        alunos = new ArrayList<>();
    }

    
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    
    public ArrayList<Aluno> filtrarAlunos(String curso, int idadeMinima, double mediaMinima) {

        if (curso == null || curso.isEmpty()) {
            throw new IllegalArgumentException("Curso inválido.");
        }

        ArrayList<Aluno> resultado = new ArrayList<>();

        for (Aluno a : alunos) {
            if (a.getCurso().equalsIgnoreCase(curso)
                    && a.getIdade() >= idadeMinima
                    && a.getMediaFinal() >= mediaMinima) {

                resultado.add(a);
            }
        }

        return resultado;
    }

   
    public Aluno buscarPorMatricula(String matricula) {

        if (matricula == null || matricula.isEmpty()) {
            throw new IllegalArgumentException("Matrícula inválida.");
        }

        for (Aluno a : alunos) {
            if (a.getMatricula().equalsIgnoreCase(matricula)) {
                return a;
            }
        }

        throw new IllegalArgumentException("Aluno não encontrado.");
    }
}