import java.time.LocalDate;
import Avaliacao.Livraria;
import Avaliacao.Livro;

public class Avaliação {
	
	public static void main(String[] args) {
		
		Livro c1 = new Livro("Clean Code", "Robert C.Martin", "9780132350884",05/10/2008,R$ 210, LocalDate.of(4/02/2026, 0, 0));
		Livro c2 = new Livro("Effective Java", "Joshua Bloch", "JKM97801346859919B12",9/03/2018, R$ 380, LocalDate.of(9/05/2026, 0, 0));
		Livro c3 = new Livro("Head First JavaScript", "Eric Freeman", "9780321125217",18/01/2014,R$ 340 , LocalDate.of(11/02/2026, 0, 0));
		Livro c4 = new Livro("Java Concurrency in Practice", "Brian Goetz", "9780321349606 ",22/06/2006,R$ 79, LocalDate.of(10/03/2026, 0, 0));
		Livro c5 = new Livro("Head First Design Patterns", "Eric Freeman", "9780596007126",20/05/2014,R$ 58, LocalDate.of(24/03/2026, 0, 0));
		
		Livraria l = new Livraria();

		.adicionarlivro(c1);
		c.adicionarLivro(c2);
		c.adicionarLivro(c3);
		c.adicionarLivro(c4);
		c.adicionarlivro(c5);
		
		System.out.println(c.obterTituloLivro("Effective Java"));
		
		
		
		System.out.println(c.obterLivro("", 20000, 25000));
		
		 } 
}

		
		
	}

	
}
