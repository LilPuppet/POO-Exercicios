import java.util.Scanner;
public class Q19 {
    public static void main (String [] args){
        Scanner s = new Scanner (System.in);
        int fat = s.nextInt();
        fatorial(fat);
        s.close();
    }

    public static int fatorial (int x){
        int aux;
        if (x==0){
            System.out.println("\t".repeat(x)+ x+"!=1");
            return 1;
        }
        else{
            aux = x* fatorial(x-1);
            System.out.println("\t".repeat(x)+ x+"!="+aux);
            return aux;
        }
    }
}
