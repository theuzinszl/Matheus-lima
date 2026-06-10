import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();

        double valor;

       
        System.out.println("Digite valores decimais (0 para parar):");
        while (true) {
            valor = scanner.nextDouble();
            if (valor == 0) {
                break;
            }
            numeros.add(valor);
        }

        
        if (numeros.isEmpty()) {
            System.out.println("Nenhum valor foi digitado.");
            return;
        }

        
        double menor = numeros.get(0);
        double maior = numeros.get(0);
        double soma = 0;

        
        for (double num : numeros) {
            if (num < menor) {
                menor = num;
            }
            if (num > maior) {
                maior = num;
            }
            soma += num;
        }

        double media = soma / numeros.size();

        
        System.out.println("Menor número: " + menor);
        System.out.println("Maior número: " + maior);
        System.out.println("Média: " + media);

        scanner.close();
    }
}