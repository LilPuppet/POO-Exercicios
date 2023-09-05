import java.util.Scanner;
public class Q11 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double x1,x2,y1,y2;;

        System.out.println("Informe o primeiro ponto:");
        x1 = s.nextDouble();
        x2 = s.nextDouble();
        System.out.println("Informe o segundo ponto:");
        y1 = s.nextDouble();
        y2 = s.nextDouble();

        if (x1<y1 && x2<y2){ System.out.println("Acima e à Direita.");}
        if (x1==y1 && x2<y2){ System.out.println("Acima.");}
        if (x1>y1 && x2<y2){ System.out.println("Acima e à Esquerda.");}
        if (x1>y1 && x2==y2){ System.out.println("À Esquerda");}
        if (x1>y1 && x2>y2){ System.out.println("Abaixo e à Esquerda.");}
        if (x1==y1 && x2>y2){ System.out.println("Abaixo.");}
        if (x1<y1 && x2>y2){ System.out.println("Abaixo e à Direita.");}
        if (x1<y1 && x2==y2){ System.out.println("À Direita.");}

        s.close();
    }
}