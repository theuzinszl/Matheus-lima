
public class Ex9 {
 
	public static void main(String[] args) {
		
		public class VlCarro{
		    private int velocidade;

		    public VlCarro() {
		        this.velocidade = 0;
		    }

		    public int getVelocidade() {
		        return velocidade;
		    }

		    public void setVelocidade(int velocidade) {
		        if (velocidade < 0) {
		            this.velocidade = 0;
		        } else {
		            this.velocidade = velocidade;
		        }
		    }

		    public void acelerar(int valor) throws Exception {
		        if (valor >= 0 && valor < 20) {
		            setVelocidade(this.velocidade + valor);
		        } else {
		            throw new Exception("Valor inválido para acelerar (0 a 19)");
		        }
		    }

		    public void reduzir(int valor) throws Exception {
		        if (valor >= 0 && valor < 30) {
		            setVelocidade(this.velocidade - valor);
		        } else {
		            throw new Exception("Valor inválido para reduzir (0 a 29)");
		        }
		    }
		}
		
		
	}
}
