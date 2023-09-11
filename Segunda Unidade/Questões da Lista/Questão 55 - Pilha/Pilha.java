import java.util.Scanner;
import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Digite uma string de parênteses: ");
        String string = s.nextLine();

        if (!string.matches("[()]+")) {
            s.close();
            throw new IllegalArgumentException("A string possui outros caracteres além de parênteses!");
        }

        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == '(') {
                pilha.push(c);
            } else if(c == ')'){
                if (!pilha.isEmpty() && pilha.peek() == '(') {
                    pilha.pop();
                } else{
                    System.out.println("Não está balanceado!");
                    s.close();
                    return;
                }
            }
        }

        if (pilha.isEmpty()) {
            System.out.println("Está balanceada!");
        } else{
            System.out.println("Não está balanceado!");
        }

        s.close();
    }
}