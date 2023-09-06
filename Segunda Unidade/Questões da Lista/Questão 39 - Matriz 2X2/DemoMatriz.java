import java.util.Scanner;

public class DemoMatriz {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Insira os elementos da matriz:");
            float n1 = s.nextFloat();
            float n2 = s.nextFloat();
            float n3 = s.nextFloat();
            float n4 = s.nextFloat();
            Matriz matriz = new Matriz(n1, n2, n3, n4);
            System.out.println(matriz.determinante()+"\n\n");
            System.out.println(matriz);
            s.close();
        }
} 
