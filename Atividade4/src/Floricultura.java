import java.util.ArrayList;

public class Floricultura {

    private ArrayList<Flor> vendas;

    public Floricultura() {
        vendas = new ArrayList<>();
    }

    
    public void adicionarVenda(Flor flor) {
        vendas.add(flor);
    }

    
    public ArrayList<Flor> buscarFloresPorCliente(String nomeCliente) {

        if (nomeCliente == null || nomeCliente.isEmpty()) {
            throw new IllegalArgumentException("Nome do cliente inválido.");
        }

        ArrayList<Flor> resultado = new ArrayList<>();

        for (Flor f : vendas) {
            if (f.getNomeCliente().equalsIgnoreCase(nomeCliente)) {
                resultado.add(f);
            }
        }

        return resultado;
    }
}