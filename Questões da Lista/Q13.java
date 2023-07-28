public class Q13 {
    public static void main (String [] args){
        for (int i = 1; i <= 60; i++) {
           if(i%10==1){
                System.out.print("\n");
           }
            if(i<10){
                System.out.print(i + "  "); 
           }
            else{System.out.print(i + " ");}         
        }
    }
}
