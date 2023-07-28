public class Q16 {
    public static void main (String [] args){
        int c,d,u;
        for (int i = 100; i <= 999; i++) {
            c = i / 100;
            d = (i % 100) / 10;
            u = i % 10;

            if((Math.pow(c,3)+Math.pow(d,3)+Math.pow(u,3)==i)){
                System.out.println(i);
            }
        }
    }
}
