public class {
    public static void main(String[] args) {

        Carro carro = new VlCarro();

        try {
            carro.setVelocidade(50);

            carro.acelerar(10);
            System.out.println("Velocidade após acelerar: " + carro.getVelocidade());

            carro.reduzir(20);
            System.out.println("Velocidade após reduzir: " + carro.getVelocidade());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
