
public class cachorro extends Animal {
	
	private String raca;
	
	public Cachorro(String especie, double peso, String raca) {
		super(especie, peso);
		setRaca(raca);
	}

	@Override
	public String emitirSom() {
		return "Au au";
	}
	
	public String getRaca() {
		return raca;
	}
		
		public void setRaca(String raca) {
			if (raca == null || raca.isBlank()) {
				throw new IllegalArgumentException("Raça inválida");
			}
			this.raca = raca;
		}
}
