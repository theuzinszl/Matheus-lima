import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 4: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                verao();
                break;
            case 2:
                outono();
                break;
            case 3:
                inverno();
                break;
            case 4:
                primavera();
                break;
            default:
                System.out.println("Número inválido!");
        }

        scanner.close();
    }

    public static void verao() {
        System.out.println("É verão");
        System.out.println("E o tempo está quente.");
    }

    public static void outono() {
        System.out.println("É outono");
        System.out.println("E o clima está ameno.");
    }

    public static void inverno() {
        System.out.println("É inverno");
        System.out.println("E está frio.");
    }

    public static void primavera() {
        System.out.println("É primavera");
        System.out.println("E as flores estão florescendo.");
    }
}
