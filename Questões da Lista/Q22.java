import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int num;
        int [] coeficientes = {1, 2, 3};

        System.out.println ("Informe o valor de X: ");
        num = ent.nextInt();

        System.out.println ("O resultado do polinomio eh: " + calcpolinomio(coeficientes.length - 1, num, coeficientes));

        ent.close();
    }

    public static int calcpolinomio (int n, int x, int[] coeficiente){
        if (n == 0){
            return (x * coeficiente[n]) + coeficiente[n];
        }
        return (x * calcpolinomio(n - 1, x, coeficiente)) + coeficiente[n];
    }

}