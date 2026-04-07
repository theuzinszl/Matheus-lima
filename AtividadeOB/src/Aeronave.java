
public class Aeronave {
	
	 private String modelo;
	    private int passageiros;
	    private double velocidadeMaxima;
	    private double capacidadeCombustivel;
	    private double queimaCombustivelPorMinuto;

	    
	    public Aeronave(String modelo, int passageiros, double velocidadeMaxima,
	                    double capacidadeCombustivel, double queimaCombustivelPorMinuto) {
	        this.modelo = modelo;
	        this.passageiros = passageiros;
	        this.velocidadeMaxima = velocidadeMaxima;
	        this.capacidadeCombustivel = capacidadeCombustivel;
	        this.queimaCombustivelPorMinuto = queimaCombustivelPorMinuto;
	    }

	   
	    public String getModelo() {
	        return modelo;
	    }

	    public int getPassageiros() {
	        return passageiros;
	    }

	    public double getVelocidadeMaxima() {
	        return velocidadeMaxima;
	    }

	    public double getCapacidadeCombustivel() {
	        return capacidadeCombustivel;
	    }

	    public double getQueimaCombustivelPorMinuto() {
	        return queimaCombustivelPorMinuto;
	    }

	    
	    public double calcularAutonomia() {
	        return capacidadeCombustivel / queimaCombustivelPorMinuto;
	    }
	}



