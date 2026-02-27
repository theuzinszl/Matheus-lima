import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.print("Digite o sobrenome de solteira da sua mãe: ");
        String sobrenomeMae = scanner.nextLine();

        System.out.print("Digite a cidade onde você nasceu: ");
        String cidade = scanner.nextLine();

        String nomeStarWars = generateStarWarsName(nomeCompleto, sobrenomeMae, cidade);

        System.out.println("Seu nome Star Wars é: " + nomeStarWars);

        scanner.close();
    }

    public static String generateStarWarsName(String nomeCompleto, String sobrenomeMae, String cidade) {

        String[] partesNome = nomeCompleto.split(" ");

        String primeiroNome = partesNome[0];
        String sobrenome = partesNome[partesNome.length - 1];

        
        String starPrimeiroNome = sobrenome.substring(0, 3)
                                   + primeiroNome.substring(0, 2);

       
        String starSobrenome = sobrenomeMae.substring(0, 2)
                                + cidade.substring(0, 3);

        return starPrimeiroNome + " " + starSobrenome;
    }
}