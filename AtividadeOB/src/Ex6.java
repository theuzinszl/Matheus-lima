
public class Ex6 {

	public static void main(String[] args) {
		
		
	
        Mercado loja1 = new Mercado("Loja A", 5000, 3000);
        Mercado loja2 = new Mercado("Loja B", 7000, 2000);
        Mercado loja3 = new Mercado("Loja C", 6000, 4000);

        Mercado[] lojas = {loja1, loja2, loja3};

        
        Mercado maiorMaca = lojas[0];
        for (Mercado m : lojas) {
            if (m.getReceitaMaca() > maiorMaca.getReceitaMaca()) {
                maiorMaca = m;
            }
        }
        System.out.println("Maior receita com maçãs: " + maiorMaca.getNomeLoja());

        
        Mercado menorLaranja = lojas[0];
        for (Mercado m : lojas) {
            if (m.getReceitaLaranja() < menorLaranja.getReceitaLaranja()) {
                menorLaranja = m;
            }
        }
        System.out.println("Menor receita com laranjas: " + menorLaranja.getNomeLoja());

        
        for (int i = 0; i < lojas.length; i++) {
            for (int j = i + 1; j < lojas.length; j++) {
                if (lojas[j].getReceitaTotal() > lojas[i].getReceitaTotal()) {
                    Mercado temp = lojas[i];
                    lojas[i] = lojas[j];
                    lojas[j] = temp;
                }
            }
        }
        System.out.println("Segunda maior receita total: " + lojas[1].getNomeLoja());

        
        double totalMaca = 0;
        double totalLaranja = 0;

        for (Mercado m : lojas) {
            totalMaca += m.getReceitaMaca();
            totalLaranja += m.getReceitaLaranja();
        }

        if (totalMaca > totalLaranja) {
            System.out.println("A franquia lucrou mais com maçãs.");
        } else {
            System.out.println("A franquia lucrou mais com laranjas.");
        }
    }
	}
}
