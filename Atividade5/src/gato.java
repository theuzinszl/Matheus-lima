
public class gato extends Animal {

	private boolean castrado;
	
	public Gato(String especie, double peso, boolean castrado) {
		super(especie, peso);
		setCastrado(castrado);
	}
	
	public boolean isCastrado() {
		return castrado;
	}
	
	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}
	
	@Override
	public String emitirSom() {
		return "Miau";
	}
	
}

