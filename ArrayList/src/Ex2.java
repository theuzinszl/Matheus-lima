import java.util.ArrayList;
import java.util.Collections;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Bruno");
        nomes.add("Diana");
        nomes.add("Eduardo");

        
        Collections.reverse(nomes);

        
        System.out.println(nomes);
    }
}