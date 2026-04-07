
public class Ex5 {

	public static void main(String[] args) {
		
		 Funcionario f = new Funcionario(1, "Maria", "Souza", 2500.0);

	        System.out.println("Nome: " + f.obterNomeCompleto());
	        System.out.println("Salário mensal: " + f.getSalario());
	        System.out.println("Salário anual: " + f.obterSalarioAnual());

	        f.aumentarSalario(20); 
	        System.out.println("Novo salário mensal: " + f.getSalario());
	    
	}
}
