import java.util.Scanner;

public class TesteMortalKombat {
    public static void main (String [] args){
        int opcao= 0, torre = 0, round1, round2, round3;
        Scanner s = new Scanner (System.in);
        Jogador j= new Jogador(0,0);
        System.out.println("BEM VINDO AO TORNEIO MORTAL KOMBAT!");
        System.out.println("Deseja iniciar um novo jogo?");
        System.out.println("1- Sim");
        System.out.println("2- Não");
        opcao = s.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Por favor, defina o tamanho da torre que deseja subir:");
                torre = s.nextInt();
                j.setVitorias(0);
                j.setDerrotas(0);
                System.out.println("Que se inicie o torneio!");
                break;
            case 2:
                System.out.println("Por favor, nos diga o número de vitórias, derrotas e o tamanho da sua torre:");
                j.setVitorias(s.nextInt());
                j.setDerrotas(s.nextInt());
                torre = s.nextInt();
                System.out.println("Que se inicie o torneio!");
                break;
        }

        while (j.isClassificado()!=false && j.vitorioso!=true){
            System.out.println("TOURNAMENT "+(j.getVitorias()+j.getDerrotas())+ " , COMEÇE!");
            System.out.println("1 para vitória, 0 para derrota!");
            System.out.println("Por favor, nos envie o resultado do primeiro round:");
            round1 = s.nextInt();
            System.out.println("Por favor, nos envie o resultado do segundo round");
            round2 =s.nextInt();
            if (round1+round2==2){
                j.classificacao(true, true, false);
            }
            else if (round1+round2==0){
                j.classificacao(false, false, false);
            }
            else{
                System.out.println("Por favor, nos envie o resultado do terceiro round");
                round3=s.nextInt();
                if(round1+round2+round3==2){
                    j.classificacao(true, false, true);
                }
                else{
                    j.classificacao(false, false, false);
                }
            }
            System.out.println("Gostaria de ver sua situação neste round?\n 1-Sim 0-Não");
            opcao=s.nextInt();
            switch(opcao){
                case 1:
                    j.lugarNaTorre(torre);
                    break;
                default:
            }
            s.close();
        }



    }
}
