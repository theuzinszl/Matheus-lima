import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        exibirNumeros(numero);
        
        scanner.close();
    }

    public static void exibirNumeros(int numero) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(numero + i);
        }
    }
}