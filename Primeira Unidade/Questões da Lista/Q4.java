import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print ("Informe a temperatura em graus centrigrados: ");
        
        double C = s.nextDouble();
        double F = C * 1.8 + 32;

        System.out.println("A temperatuda em Fahrenheit eh: " + F);

        s.close();
    }
}
