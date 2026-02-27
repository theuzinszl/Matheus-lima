import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número base: ");
        int base = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num2 = scanner.nextInt();

        verificarMaisProximo(base, num1, num2);

        scanner.close();
    }

    public static void verificarMaisProximo(int base, int num1, int num2) {

        int distancia1 = Math.abs(base - num1);
        int distancia2 = Math.abs(base - num2);

        if (distancia1 < distancia2) {
            System.out.println("O número mais próximo da base é: " + num1);
        } else if (distancia2 < distancia1) {
            System.out.println("O número mais próximo da base é: " + num2);
        } else {
            System.out.println("Os dois números estão à mesma distância da base.");
        }
    }
}
	
	
	
}
