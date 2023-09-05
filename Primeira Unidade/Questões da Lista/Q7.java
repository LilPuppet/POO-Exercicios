import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
        Scanner ent = new Scanner (System.in);

        System.out.print ("Informe os números: ");
        int num1 = ent.nextInt();
        int num2 = ent.nextInt();
        int num3 = ent.nextInt();

        int menor = num1;

        if (num2 < menor) menor = num2;
        if (num3 < menor) menor = num3;

        System.out.println ("O menor é " + menor);

        ent.close();
    }
}
