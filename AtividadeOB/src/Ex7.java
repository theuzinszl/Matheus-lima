
public class Ex7 {
 
	public static void main(String[] args) {
		
		Aeronave a1 = new Aeronave("Boeing 737", 180, 850, 26000, 50);

        System.out.println("Modelo: " + a1.getModelo());
        System.out.println("Passageiros: " + a1.getPassageiros());
        System.out.println("Velocidade Máxima: " + a1.getVelocidadeMaxima());
        System.out.println("Autonomia (min): " + a1.calcularAutonomia());
	}
}
