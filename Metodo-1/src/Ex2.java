import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome de um colega:");
        String nome = sc.nextLine();

      
        if (nome.equalsIgnoreCase("Ana")) {
            Ana();
        } else if (nome.equalsIgnoreCase("Bruno")) {
            Bruno();
        } else if (nome.equalsIgnoreCase("Carla")) {
            Carla();
        } else {
            System.out.println("Colega não encontrado!");
        }

        sc.close();
    }

    
    public static void Ana() {
        System.out.println("O nome dela é Ana");
        System.out.println("Ela tem 20 anos");
        System.out.println("Ela é estudante de desenvolvimento de sistemas");
    }

    public static void Bruno() {
        System.out.println("O nome dele é Bruno");
        System.out.println("Ele tem 22 anos");
        System.out.println("Ele é estudante de desenvolvimento de sistemas");
    }

    public static void Carla() {
        System.out.println("O nome dela é Carla");
        System.out.println("Ela tem 19 anos");
        System.out.println("Ela é estudante de desenvolvimento de sistemas");
    }
}