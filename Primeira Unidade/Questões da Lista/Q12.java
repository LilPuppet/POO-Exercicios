import java.util.Scanner;
public class Q12 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Se fevereiro começou no domingo, qual é o dia da semana do dia?:");
        int dia = s.nextInt();
        while(dia<1 || dia>28){
            System.out.println("Este dia não existe em fevereiro, digite um válido:");
            dia = s.nextInt();
        }
        if (dia%7==1){
            System.out.println("O dia "+dia+" é domingo.");
        }
        if (dia%7==2){
            System.out.println("O dia "+dia+" é segunda.");
        }
        if (dia%7==3){
            System.out.println("O dia "+dia+" é terça.");
        }
        if (dia%7==4){
            System.out.println("O dia "+dia+" é quarta.");
        }
        if (dia%7==5){
            System.out.println("O dia "+dia+" é quinta.");
        }
        if (dia%7==6){
            System.out.println("O dia "+dia+" é sexta.");
        }
        if (dia%7==0){
            System.out.println("O dia "+dia+" é sábado.");
        }
        s.close();
    }
}
