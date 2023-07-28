import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double ang, rad;

        System.out.println ("Informe um angulo: ");
        ang = s.nextDouble();

        rad = Math.toRadians(ang);

        System.out.println ("O angulo: " + ang);
        System.out.println ("Em Radianos: " + rad);
        System.out.println ("O seno: " + Math.sin(rad));
        System.out.println ("O cosseno: " + Math.cos(rad));
        System.out.println ("A tangente: " + Math.tan(rad));
        System.out.println ("A cossecante: " + 1/Math.sin(rad));
        System.out.println ("A secante: " + 1/Math.cos(rad));
        System.out.println ("A cotangente: " + 1/Math.tan(rad));

        s.close();
    }
}