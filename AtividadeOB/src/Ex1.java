
public class Ex1 {
	
	public static void main(String[] args) {
		
		
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "João Silva";
        pessoa1.sexo = 'M';
        pessoa1.dataNascimento = "10/05/2000";
        pessoa1.estadoCivil = "Solteiro";

       
        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Maria Souza";
        pessoa2.sexo = 'F';
        pessoa2.dataNascimento = "22/08/1998";
        pessoa2.estadoCivil = "Casada";

        pessoa1.mostrarDados();
        pessoa2.mostrarDados();
    }
}
	
	
	
