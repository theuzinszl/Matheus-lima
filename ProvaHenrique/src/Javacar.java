
public class Javacar {

	public static void main(String[] args) {
	
		LojaCarros loja = new LojaCarros() {
			
			Carro c1 = new carro("Volkswagen", "Gol", "FTX2A45", "2010", 21000, "14/03/2024");
			Carro c2 = new carro("Chevrolet", "Onix", "JKM9B12", "2015", 38000, "29/11/2024");
			Carro c3 = new carro("Honda", "Civic", "LPR4C67", "2010", 34000, "07/06/2023");
			Carro c4 = new carro("Chevrolet", "Cruze", "QWE7D89", "2019", 79000, "18/01/2025");
			Carro c5 = new carro("Volkswagen", "Polo", "ZTR1F23", "2019", 58000, "25/08/2024");
		
			loja.adicionarCarro(c1);
	        loja.adicionarCarro(c2);
	        loja.adicionarCarro(c3);
		}
	        
	        Cliente cli1 = new Cliente("Carlos", 30, 500000);
	        Cliente cli2 = new Cliente("Maria", 45, 800000);

	        loja.adicionarCliente(cli1);
	        loja.adicionarCliente(cli2);
		 
		
		
		}
	
}
