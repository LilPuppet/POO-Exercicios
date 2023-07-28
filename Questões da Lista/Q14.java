import java.util.Scanner;
public class Q14 {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner (System.in);

        System.out.println("Quer a sequência até que número?");
        n = s.nextInt();

        while(n<1){
            System.out.println("Por favor, 1 ou acima disso.");
            n = s.nextInt();

        }
        
        for (int i = 1; i <= n; i++) {
            System.out.print("(" + i + "):" + Fibonacci(i) + "\t");
        }
        
        s.close();
    }
        
    public static int Fibonacci(int n) {
        int Fibo = 0;     //Resultado final
        int Anterior = 0; //Fibo anterior
        int Aux = 0;      //Auxiliar de soma e troca
            for (int i = 1; i <= n; i++) {
                    if (i == 1) {
                        Fibo = 1;
                        Anterior = 0;
                    } 
                    else {
                        Aux = Anterior; //O auxiliar irá guardar o anterior usado na soma.
                        Anterior = Fibo;//O atual vira o próximo anterior a ser usado.
                        Fibo += Aux; //O fibonacci será somado ao auxiliar, que possui o anterior, para que crie o novo fibonacci atual
                    }
        
                }
        
                return Fibo;
            
            
    }
}
