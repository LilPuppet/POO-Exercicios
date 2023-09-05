package Questao04;
import java.util.Scanner;

public class DemoMaiorDe {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        // Inteiros
        System.out.println("Insira 5 números Inteiros: ");
        int n1 = ent.nextInt();
        int n2 = ent.nextInt();
        int n3 = ent.nextInt();
        int n4 = ent.nextInt();
        int n5 = ent.nextInt();
        System.out.println("Maior dos Dois Primeiros: "+ MaiorDe.maiorNum(n1, n2));
        System.out.println("Maior dos Três Primeiros: "+ MaiorDe.maiorNum(n1, n2, n3));
        System.out.println("Maior dos Quatro Primeiros: "+ MaiorDe.maiorNum(n1, n2, n3, n4));
        System.out.println("Maior dos Cinco: "+ MaiorDe.maiorNum(n1, n2, n3, n4, n5));

        // Double
        System.out.println("\nInsira 5 números Double: ");
        double d1 = ent.nextDouble();
        double d2 = ent.nextDouble();
        double d3 = ent.nextDouble(); 
        double d4 = ent.nextDouble();
        double d5 = ent.nextDouble();
        System.out.println("Maior dos Dois Primeiros: "+ MaiorDe.maiorNum(d1, d2));
        System.out.println("Maior dos Três Primeiros: "+ MaiorDe.maiorNum(d1, d2, d3));
        System.out.println("Maior dos Quatro Primeiros: "+ MaiorDe.maiorNum(d1, d2, d3, d4));
        System.out.println("Maior dos Cinco: "+ MaiorDe.maiorNum(d1, d2, d3, d4, d5));
        ent.close();
    }
}
