import java.util.ArrayList;

public class ListaRetangulos {

    private ArrayList<Retangulo> lista;

    public ListaRetangulos() {
        lista = new ArrayList<>();
    }

   
    public void adicionarRetangulo(Retangulo r) {
        lista.add(r);
    }

    
    public Retangulo maiorArea() {
        if (lista.isEmpty()) {
            throw new IllegalStateException("Lista vazia.");
        }

        Retangulo maior = lista.get(0);

        for (Retangulo r : lista) {
            if (r.calcularArea() > maior.calcularArea()) {
                maior = r;
            }
        }

        return maior;
    }

    
    public Retangulo maiorPerimetro() {
        if (lista.isEmpty()) {
            throw new IllegalStateException("Lista vazia.");
        }

        Retangulo maior = lista.get(0);

        for (Retangulo r : lista) {
            if (r.calcularPerimetro() > maior.calcularPerimetro()) {
                maior = r;
            }
        }

        return maior;
    }

    
   
    public String toString() {
        return lista.toString();
    }
}