import java.util.Arrays;
import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        LinkedList<String> palavra = new LinkedList<>(Arrays.asList("a", "r", "a", "r", "a", "1", "2", "3", "4"));
        LinkedList<String> contrario = new LinkedList<>();

        for (int i = palavra.size() - 1; i >= 0; i--){
            contrario.add(palavra.get(i));
        }

          System.out.println (palavra);
          System.out.println (contrario);
    }

}