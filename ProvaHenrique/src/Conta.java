
public class Conta {

	private String nomeTitular;
	private double saldo; 
	
	public Conta (String nomeTitular, double saldo) {
		
		this.setNomeTitular(nomeTitular);
        this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo; 
	}
	
	public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
 
	public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado.");
        } else {
            System.out.println("Valor inválido.");
        }
	
	}
	
	public void transferir(Conta destino, double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            destino.saldo += valor;
            System.out.println("Transferência realizada.");
        } else {
            System.out.println("Saldo insuficiente.");
        }

	}
	
	public double simularInvestimento(double valor, int meses) {
        double taxa = 0.01; 
        return valor * Math.pow((1 + taxa), meses);
    }

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}


}    

	
