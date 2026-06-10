import java.util.ArrayList;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        
        numeros.add(10);
        numeros.add(25);
        numeros.add(7);
        numeros.add(42);
        numeros.add(3);

        
        System.out.print("Digite um número para buscar: ");
        int busca = scanner.nextInt();

        
        if (numeros.contains(busca)) {
            int indice = numeros.indexOf(busca);
            System.out.println("Número encontrado no índice: " + indice);
        } else {
            System.out.println("Número não encontrado na lista.");
        }

        scanner.close();
    }
}
