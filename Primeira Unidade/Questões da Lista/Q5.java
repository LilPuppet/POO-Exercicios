import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        int num, c, d, u;

        System.out.println ("Informe um numero que contenha tres digitos:");
        num = ent.nextInt();

        c = num / 100;
        d = (num % 100) / 10;
        u = num % 10;


        System.out.println ("O numero em formato UCD eh: " + (u * 100 + c * 10 + d));
        
        ent.close();
    }
}