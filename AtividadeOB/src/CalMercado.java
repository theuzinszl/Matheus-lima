
public class CalMercado {
	
	private String nomeLoja;
    private double receitaMaca;
    private double receitaLaranja;

    
    public CalMercado(String nomeLoja, double receitaMaca, double receitaLaranja) {
        this.nomeLoja = nomeLoja;
        this.receitaMaca = receitaMaca;
        this.receitaLaranja = receitaLaranja;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public double getReceitaMaca() {
        return receitaMaca;
    }

    public double getReceitaLaranja() {
        return receitaLaranja;
    }

    public double getReceitaTotal() {
        return receitaMaca + receitaLaranja;
    }
}