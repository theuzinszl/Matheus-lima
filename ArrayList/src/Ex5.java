import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

      
        ArrayList<Character> original = new ArrayList<>();

       
        for (int i = 0; i < palavra.length(); i++) {
            original.add(palavra.charAt(i));
        }

        
        ArrayList<Character> invertida = new ArrayList<>(original);

      
        Collections.reverse(invertida);

        
        if (original.equals(invertida)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo!");
        }

        scanner.close();
    }
}