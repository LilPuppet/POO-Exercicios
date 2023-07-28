import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int carta, naipe;
        String nomeCarta = "";
        String nomeNaipe = "";

        System.out.println ("Informe o valor de uma carta: ");
        carta = s.nextInt();
        
        while (carta<1 || carta>13){
        System.out.println ("Inválido! \nInforme o valor de uma carta: ");
        carta = s.nextInt();    
        }

        System.out.println ("Informe o valor de um naipe: ");
        naipe = s.nextInt();

        while (naipe<1 || naipe>4){
        System.out.println ("Inválido! \nInforme o valor de um naipe: ");
        naipe = s.nextInt();    
        }

        switch (carta){
            case 1:
                nomeCarta = "AS";
                break;
            case 2:
                 nomeCarta = "DOIS";
                 break;
            case 3:
                nomeCarta = "TRES";
                break;
            case 4:
                nomeCarta = "QUATRO";
                break;
            case 5:
                nomeCarta = "CINCO";
                break;
            case 6:
                nomeCarta = "SEIS";
                break;
            case 7:
                nomeCarta = "SETE";
                break;
            case 8:
                nomeCarta = "OITO";
                break;
            case 9:
                nomeCarta = "NOVE";
                break;
            case 10:
                nomeCarta = "DEZ";
                break;
            case 11:
                nomeCarta = "VALETE";
                break;
            case 12:
                nomeCarta = "RAINHA";
                break;
            case 13:
                nomeCarta = "REI";
                break;
        }

        switch (naipe){
            case 1:
                nomeNaipe = "OUROS";
                break;
            case 2:
                nomeNaipe = "PAUS";
                break;
            case 3:
                nomeNaipe = "COPAS";
                break;
            case 4:
                nomeNaipe = "ESPADAS";
                break;
        }

        System.out.println ( nomeCarta + " DE " + nomeNaipe + "!");

        s.close();
    }
}