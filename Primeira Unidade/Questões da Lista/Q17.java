public class Q17 {
    public static void main (String [] args){
        int A =7000, B=20000, cont=0;
        while (A<B){
            A+= A*0.35;
            B+= B*0.1;
            cont++;
        }
        System.out.println("A será maior que B em " + cont + " anos.");
    }
}
