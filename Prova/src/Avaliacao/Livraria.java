package Avaliacao;

import java.util.ArrayList;
import java.util.List;

public class Livraria {

	private List<Livraria> listaLivros; 
	  
	 public Livraria() { 
	   
	  listaLivros = new ArrayList<>(); 
	   
	 } 
	   
	 public void adicionarLivro(Livraria l) { 
	  listaLivros.add(l); 
	 } 
	 
	 public Livraria obterLivroTitulo(String titulo) {
			for (Livraria l  : listaLivros) {
				if (l.getTitulo().equals(titulo)) {
					return l;
				}
			}
			return null;
		}

	 
	 public List<Livraria> obterLivro(String titulo, double preco1 , double preco2) {

			List<Livraria> listaLivroTitulo = new ArrayList<Livraria>();

			for (Livraria l : listaLivros) {
				if (l.getTitulo().equalsIgnoreCase(titulo) && l.getPreco() >= preco1 && l.getPreco() <= preco2) {
					listaLivroTitulo.add(l);
				}
			}

			return listaLivros;
		}

	 private String getTitulo() {
		
		return null;
	}

	 private double getPreco() {
		
		return 0;
	 }
	 
	 }
