
public class Funcionario {
   
	 	private int identificacao;
	    private String nome;
	    private String sobrenome;
	    private double salario; 

	    
	    public Funcionario(int identificacao, String nome, String sobrenome, double salario) {
	        this.identificacao = identificacao;
	        this.nome = nome;
	        this.sobrenome = sobrenome;
	        this.salario = salario;
	    }

	    
	    public double obterSalarioAnual() {
	        return salario * 12;
	    }

	   
	    public String obterNomeCompleto() {
	        return nome + " " + sobrenome;
	    }

	   
	    public void aumentarSalario(double percentual) {
	        salario += salario * (percentual / 100);
	    }

	   
	    public double getSalario() {
	        return salario;
	    }
	}
	

