
public class Contribuinte {

	 private String nome;
	    private String cpf;
	    private String uf;
	    private double rendaAnual;

	    
	    public Contribuinte(String nome, String cpf, String uf, double rendaAnual) {
	        this.nome = nome;
	        this.cpf = cpf;
	        this.uf = uf;
	        this.rendaAnual = rendaAnual;
	    }

	 
	    public double getAliquota() {
	        if (rendaAnual <= 4000) {
	            return 0.0;
	        } else if (rendaAnual <= 9000) {
	            return 0.058;
	        } else if (rendaAnual <= 25000) {
	            return 0.15;
	        } else if (rendaAnual <= 35000) {
	            return 0.275;
	        } else {
	            return 0.30;
	        }
	    }

	    
	    public double calcularImposto() {
	        return rendaAnual * getAliquota();
	    }

	    public String getNome() {
	        return nome;
	    }
	    
}


