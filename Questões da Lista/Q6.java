import java.util.Scanner;

public class Q6 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int dias, hrs, min;

        System.out.print ("Informe um intervalo de tempo: ");
        int temp = s.nextInt();

        dias = (temp / 60) / 24;
        temp = temp - ((dias * 24) * 60);
        hrs = temp / 60;
        min = temp - (hrs * 60);

        System.out.println ("Dias: " + dias);
        System.out.println ("Horas: " + hrs);
        System.out.println ("Minutos: " + min);
        
        s.close();
    }
}