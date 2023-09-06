import java.util.Scanner;

public class DemoMatriz {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Insira os elementos da matriz:");
            float n1 = sc.nextFloat();
            float n2 = sc.nextFloat();
            float n3 = sc.nextFloat();
            float n4 = sc.nextFloat();
            Matriz matriz = new Matriz(n1, n2, n3, n4);
            System.out.println(matriz.determinante());
            System.out.println();
            System.out.println(matriz);
            sc.close();
        }
} 
