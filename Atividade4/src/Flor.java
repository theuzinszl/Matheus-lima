public class Flor {

    private String nomeFlor;
    private double preco;
    private String nomeCliente;

    
    public Flor(String nomeFlor, double preco, String nomeCliente) {
        setNomeFlor(nomeFlor);
        setPreco(preco);
        setNomeCliente(nomeCliente);
    }

   
    public String getNomeFlor() {
        return nomeFlor;
    }

    public void setNomeFlor(String nomeFlor) {
        if (nomeFlor == null || nomeFlor.isEmpty()) {
            throw new IllegalArgumentException("Nome da flor inválido.");
        }
        this.nomeFlor = nomeFlor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("Preço deve ser maior que zero.");
        }
        this.preco = preco;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        if (nomeCliente == null || nomeCliente.isEmpty()) {
            throw new IllegalArgumentException("Nome do cliente inválido.");
        }
        this.nomeCliente = nomeCliente;
    }

    public String toString() {
        return "Flor [nome=" + nomeFlor +
               ", preco=" + preco +
               ", cliente=" + nomeCliente + "]";
    }
}