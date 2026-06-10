package Avaliacao;

import java.time.LocalDate;

public class Livro {

	private String titulo;
	private String autor;
	private int isbn;
	private LocalDate dataPublicação;
	private double preco;
	private int ano;
	private LocalDate dataEmprestimo;
	
	public Livro(String titulo, String autor, int isbn, LocalDate dataPublicação, double preco, LocalDate dataEmprestimo) {
		super();
		setTitulo(titulo);
		setAutor(autor);
		setIsbn(isbn);
		setDataPublicação(dataPublicação);
		setPreco(preco);
		setAno(ano);
		setDataEmprestimo(dataEmprestimo);
	}
	
	public void depreciacaoPreco (int titulo , double precoLivro  , int tempo) { 
		  if (precoLivro <= 0.0) { 
		   throw new IllegalArgumentException("Valor do livro inválido!"); 
		  } 
		  if (tempo <= 0) { 
		   throw new IllegalArgumentException("Tempo inválido"); 
		  } 
		  
		 
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if(autor == null || autor.isBlank()) {
			throw new IllegalArgumentException("Autor inválido!");
		}
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if(titulo == null || titulo.isBlank()) {
			throw new IllegalArgumentException("titulo inválido!");
		}
		this.titulo = titulo;
	}

	

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (ano < 0) {
			throw new IllegalArgumentException("Ano inválido!");
		}
		this.ano = ano;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco < 0) {
			throw new IllegalArgumentException("Preço inválido");
		}
		this.preco = preco;
	}

	public LocalDate getDataPublicação() {
		return dataPublicação;
	}

	public void setDataPublicação(LocalDate dataPublicação) {
		if (dataPublicação == null || dataPublicação.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("Data de publicação inválida!");
		}
		this.dataPublicação = dataPublicação;
		
	}
	
	public void setDataEmprestimo(LocalDate dataEmprestimo) {
		if (dataEmprestimo == null || dataEmprestimo.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("Data de emprestimo  inválida!");
		}
		this.dataEmprestimo = dataEmprestimo;
	}
	
	
	

	@Override
	public String toString() {
		return "Livro [autor=" + autor + ", titulo=" + titulo +  ", ano=" + ano + ", preco=" + preco
				+ ", dataPublicação=" + dataPublicação + ", dataEmprestimo=" +" dataEmprestimo ]";"
	}
	
	
	
}
