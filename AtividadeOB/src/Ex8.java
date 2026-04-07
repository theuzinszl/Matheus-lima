
public class Ex8 {
	
	public static void main(String[] args) {
		
		 Contribuinte c1 = new Contribuinte("João", "111.111.111-11", "PR", 40000);
	        Contribuinte c2 = new Contribuinte("Maria", "222.222.222-22", "SC", 20000);
	        Contribuinte c3 = new Contribuinte("Carlos", "333.333.333-33", "RS", 10000);
	        Contribuinte c4 = new Contribuinte("Ana", "444.444.444-44", "PR", 8000);
	        Contribuinte c5 = new Contribuinte("Pedro", "555.555.555-55", "SC", 3000);

	        Contribuinte[] contribuintes = {c1, c2, c3, c4, c5};

	       
	        Contribuinte maior = contribuintes[0];

	        for (Contribuinte c : contribuintes) {
	            if (c.calcularImposto() > maior.calcularImposto()) {
	                maior = c;
	            }
	        }

	        System.out.println("Quem paga mais imposto: " + maior.getNome());
	        System.out.println("Valor: R$ " + maior.calcularImposto());

	        
	        double total = 0;

	        for (Contribuinte c : contribuintes) {
	            total += c.calcularImposto();
	        }

	        System.out.println("Total de imposto arrecadado: R$ " + total);
		
	}

}
