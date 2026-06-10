import java.util.ArrayList;
import java.util.Collections;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        
        numeros.add(42);
        numeros.add(10);
        numeros.add(7);
        numeros.add(25);
        numeros.add(3);

        
        Collections.sort(numeros);

        
        System.out.println(numeros);
    }
}