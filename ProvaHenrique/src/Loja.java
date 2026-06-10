import java.util.ArrayList;
import java.util.List;

public class Loja {

	private List<Carro> carros;
    private List<Cliente> clientes;


    public void adicionarCarro(Carro carro) {
        carros.add(carro);

    }
    
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    
    public Cliente encontrarClienteMaisVelho() {
        Cliente maisVelho = clientes.get(0);

        for (Cliente c : clientes) {
            if (c.getIdade() > maisVelho.getIdade()) {
                maisVelho = c;
            }
        }

        return maisVelho;
    }	
 
    public List<Carro> carrosPorFaixaPreco(String marca, double min, double max) {
        List<Carro> resultado = new ArrayList<>();

        for (Carro c : carros) {
            if (c.getMarca().equalsIgnoreCase(marca)
                    && c.getpreco() >= min
                    && c.getpreco() <= max) {
                resultado.add(c);
            }
        }

        return resultado;
    }


}





