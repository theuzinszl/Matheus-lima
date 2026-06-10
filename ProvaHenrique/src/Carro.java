
public class Carro {
	
	 private String marca;
	 private String modelo;
	 private double preco;
	 private int quantidadeEstoque;
	 
	 public Carro (String marca, String modelo, double preco, int quantidadeEstoque ) {
		 
		 this.marca = marca;
	     this.modelo = modelo;
	     this.preco = preco;
	     this.quantidadeEstoque = quantidadeEstoque;

	 }
	 
	 public String  getMarca() {
		 return marca; 
	 }
	 
	 public String getModelo() {
		 return modelo ;
		 
	 }
	 
	 public double getpreco() {
		 return preco; 
		
	 }
	 
	 public int  getQuantidadeEstoque() {
		 return quantidadeEstoque; 
		 
	 }

	 public void adicionarEstoque(int quantidade) {
		 if (quantidade > 0) {
			 quantidadeEstoque += quantidade; 
			 System.out.println(quantidade + " carros adicionados ao estoque.");
		 }
	 }
	 
	 public void venderCarro(int quantidade) {
		 if (quantidade <= quantidadeEstoque) {
			 quantidadeEstoque -= quantidade; 
			 System.out.println("Venda realizada com sucesso!");
		 } else {
			 System.out.println("Estoque insuficiente");
		 }
	 }
	 
	 public String toString() {
	        return "Marca: " + marca +
	               " | Modelo: " + modelo +
	               " | Preço: R$" + preco +
	               " | Estoque: " + quantidadeEstoque;

}
	 }



