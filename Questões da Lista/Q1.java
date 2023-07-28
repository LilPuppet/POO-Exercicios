import java.util.Scanner;
public class Q1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double a, c;

        System.out.println("Informe o comprimento do lado:");
        c = s.nextDouble();
        
        a = c*c;

        System.out.println("A area do quadrado é " + a);

        s.close();
    }
}
