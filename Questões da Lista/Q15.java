public class Q15 {
    public static void main (String [] args){
        int contadorPerfeitos = 0, num = 1, soma=0;

        while (contadorPerfeitos!=4){
            for (int i = 1; i <= num/2; i++) {//quando se chega na metade do número, só ele mesmo será divisível
                if(num%i==0){
                    soma +=i;//fazendo com que a soma não considere ele sendo divisível por ele mesmo
                }
            }
            if(num==soma){//Assim, quando numero=soma(que não contem ele mesmo), significa que é perfeito
                System.out.println(num);
                contadorPerfeitos++;
            }
            soma = 0;//zera-se a soma pro proximo while
            num++;//aumenta o número em 1 para verificar-lo
        }
        
    }
}
