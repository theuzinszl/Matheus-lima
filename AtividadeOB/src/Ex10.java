
public class Ex10 {
	
	    public static void main(String[] args) {

	        OnibusEscolar onibus = new OnibusEscolar(50, 1);
	        System.out.println("Alunos: " + onibus.getQuantidadeEstudantes());
	        System.out.println("Professores: " + onibus.getQuantidadeProfessores());

	        
	        onibus.setQuantidadeProfessores(0);
	        onibus.setQuantidadeEstudantes(30);

	        System.out.println("\nApós remover professores:");
	        System.out.println("Alunos: " + onibus.getQuantidadeEstudantes());
	        System.out.println("Professores: " + onibus.getQuantidadeProfessores());
	    }
	}