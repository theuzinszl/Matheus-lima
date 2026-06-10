
public class Cliente {


		private String nome;
		private int idade;
		
		
		public Cliente(String nome, int idade, double saldoInicial) {
	        this.nome = nome;
	        this.idade = idade;
	        
		}
		
		public String getNome() {
			return nome; 
		}
		
		public int getIdade() { 
			return idade; 
		}
		
		public String toString() {
	        return nome + " | Idade: " + idade;
		}
		
		

		
	 

} 
	
