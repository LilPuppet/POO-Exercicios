import java.util.Random;
public class Dados {
    public static void main(String[] args) {
        Random dado = new Random();
        
        int[] contagem = new int[11];

        for(int i = 0; i <= 360000000; i++){
            int d1 = dado.nextInt(6) + 1;
            int d2 = dado.nextInt(6) + 1;
            int soma = d1 + d2 - 2;
            contagem[soma]++;
        }
        System.out.println ("Soma\tFrequencia");
        for(int i = 0; i < 11; i++){
            System.out.println ((i + 2) + "\t" + contagem[i]);
        }
    }
}