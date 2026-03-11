public class Atividade1 {
	 
	public static void main(String[] args) {
		
		Veiculo v1 = new Veiculo();
		
		v1.modelo = "Honda City";
		v1.comprimento = 4.57;
		v1.cor = "Preto";
		v1.passageiro = 5;
		v1.velMax = 186;
		
		Veiculo v2 = new Veiculo();
		v2.modelo = " Hyundai Sonata";
		v2.comprimento = 4.90;
		v2.cor = "Prata";
		v2.passageiro = 5;
		v2.velMax = 208;
		
		if (v1.velMax > v2.velMax) {
			System.out.println("O" + v1.modelo + " é mais rapido");
		}else {
			System.out.println("O" + v2.modelo + " é mais rapido");
		}
		
	}
}
