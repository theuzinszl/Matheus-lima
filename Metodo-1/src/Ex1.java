import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 4:");
        System.out.println("1 - Verão");
        System.out.println("2 - Outono");
        System.out.println("3 - Inverno");
        System.out.println("4 - Primavera");

        int numero = sc.nextInt();

        switch (numero) {
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

        sc.close();
    }

    public static void verao() {
        System.out.println("É verão");
        System.out.println("E o tempo está quente");
    }

    public static void outono() {
        System.out.println("É outono");
        System.out.println("E o tempo está ameno");
    }

    public static void inverno() {
        System.out.println("É inverno");
        System.out.println("E está frio");
    }

    public static void primavera() {
        System.out.println("É primavera");
        System.out.println("E o tempo está agradável");
    }
}