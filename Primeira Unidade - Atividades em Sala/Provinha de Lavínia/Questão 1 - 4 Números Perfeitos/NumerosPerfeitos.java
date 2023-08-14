public class NumerosPerfeitos {
    public static void main (String [] args){
        int contadorPerfeitos = 0, num = 1, soma=0; //Começa-se do 1, pois, pela definição de números perfeitos, zero não pode ser.
    
        while (contadorPerfeitos!=4){
            for (int i = 1; i <= num/2; i++) {//quando se chega na metade do número, só ele mesmo será divisível, assim ele mesmo não será somado
                if(num%i==0){                 //e evitamos repetições desnecessárias
                    soma +=i;
                }
            }
                if(num==soma){//Assim, quando numero=soma(que não contem ele mesmo), significa que é perfeito
                    System.out.println(num); //imprime o número
                    contadorPerfeitos++; //condição de parada = 4 números perfeitos
                }
                soma = 0;//zera-se a soma pro proximo while
                num++;//aumenta o número em 1 para poder verificar se o próximo é perfeito
            }
        }
    }