import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        double soma, media, v1, v2, v3;

        System.out.println ("Informe os tres valores: ");
        v1 = s.nextDouble();
        v2 = s.nextDouble();
        v3 = s.nextDouble();

        soma = v1 + v2 + v3;
        media = soma / 3;

        System.out.println ("Soma: " + soma);
        System.out.println ("Média: " + media);

        s.close();
    }
}
