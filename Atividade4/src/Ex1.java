public class Ex1 {
	 
    public static void main(String[] args) {

        try {
            ListaRetangulos lista = new ListaRetangulos();

            lista.adicionarRetangulo(new Retangulo(2, 5));
            lista.adicionarRetangulo(new Retangulo(3, 7));
            lista.adicionarRetangulo(new Retangulo(4, 4));

            System.out.println("Lista de retângulos:");
            System.out.println(lista);

            System.out.println("\nMaior área:");
            System.out.println(lista.maiorArea());

            System.out.println("\nMaior perímetro:");
            System.out.println(lista.maiorPerimetro());

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}