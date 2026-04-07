public class VlCarro {

    private int velocidade;

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    
    public void acelerar(int valor) throws Exception {
        if (valor >= 0 && valor < 20) {
            setVelocidade(getVelocidade() + valor);
        } else {
            throw new Exception("Valor inválido! Aceleração deve ser entre 0 e 19.");
        }
    }

    
    public void reduzir(int valor) throws Exception {
        if (valor >= 0 && valor < 30) {
            setVelocidade(getVelocidade() - valor);
        } else {
            throw new Exception("Valor inválido! Redução deve ser entre 0 e 29.");
        }
    }
}
