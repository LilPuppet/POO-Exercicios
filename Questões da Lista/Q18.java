import java.util.Scanner;
public class Q18 {
    public static void main (String []args){
        int n, x;
        Scanner s = new Scanner (System.in);
        System.out.println("Digite X e o número que será usado para elevar X");
        x = s.nextInt();
        n = s.nextInt();
        
        System.out.println("Resultado: "+ potencia(x,n));
        s.close();
    }
    public static int potencia(int x, int n){
        if(n==0){
            return 1;
        }
        else{
            return x*potencia(x, n-1);
        }
        
    }
}
