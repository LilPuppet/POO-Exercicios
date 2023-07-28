import java.util.Scanner;

public class Q8 {
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        double valor;
        System.out.println ("Informe o codigo do produto: ");
        int cod = s.nextInt();

        switch (cod){
            case 222:
            System.out.println ("SETOR DE ELETRODOMÉSTICOS");
            System.out.println ("Informe o valor do produto: ");
            valor = s.nextDouble();
            if (valor > 500){
                System.out.println ("Valor do produto com desconto: "+ valor* 0.9);
            }
            else{
                System.out.println ("Valor do produto sem desconto: "+ valor);
            }
            break;

            case 111:
            System.out.println ("SETOR DE CAMA, MESA E BANHO");
            System.out.println ("Informe o valor do produto: ");
            valor = s.nextDouble();
            if (valor > 100){
                System.out.println("Valor do produto com desconto: "+ valor* 0.6);
            }
            else if (valor >= 50 && valor <= 100){
                System.out.println("Valor do produto com desconto: "+ valor* 0.8);
            }
            else if (valor < 50){
                System.out.println("Valor do produto com desconto: "+ valor* 0.9);
            }
            break;

            default:
                System.out.println ("Codigo do produto invalido, setor nao encontrado!!!");
                break;

        }
        
        s.close();
    }
}