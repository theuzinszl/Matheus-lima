import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {

        try {
            Floricultura floricultura = new Floricultura();

            floricultura.adicionarVenda(new Flor("Rosa", 10.0, "Ana"));
            floricultura.adicionarVenda(new Flor("Tulipa", 15.0, "Carlos"));
            floricultura.adicionarVenda(new Flor("Orquídea", 25.0, "Ana"));

            ArrayList<Flor> floresDaAna = floricultura.buscarFloresPorCliente("Ana");

            System.out.println("Flores compradas por Ana:");
            for (Flor f : floresDaAna) {
                System.out.println(f);
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}