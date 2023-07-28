import java.util.Scanner;

public class Q20 {
    public static void main (String [] args){
        Scanner s = new Scanner (System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        System.out.println(mdc(m,n));
        s.close();
    }

    public static int mdc (int m, int n){
        if (n>m){
            return mdc(n, m);
        }
        else if (n==0){
            return m;
        }
        else{
            return mdc(n, (m%n));
        }
        
    }
}
