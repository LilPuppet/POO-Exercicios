//package Q28.java;

public class Jogador { //Estamos jogando Mortal Kombat.
    private int vitorias = 0; //O jogador precisa vencer dois rounds para vencer uma partida
    private int derrotas = 0; //O jogador que não conseguirem em 3 rounds, perde
    private boolean classificado = true; //A cada vitória ou derrota, o nível da torre subirá
    boolean vitorioso = false;

    public Jogador(int vitorias, int derrotas) {
        this.vitorias = vitorias;
        this.derrotas = derrotas;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public boolean isClassificado() {
        return classificado;
    }

    public void setClassificado(boolean classificado) {
        this.classificado = classificado;
    }

    


    public void classificacao (boolean round1, boolean round2, boolean round3){
        if (round1 == true){
            if (round2 == true){
                vitorias++;
            }
            else if(round3 == true){
                vitorias++;
            }
        }
        if (round1 == false){
            if (round2==true && round3==true){
                vitorias++;
            }
            else{
                derrotas++;
            }
        }
        if (derrotas==3){
            System.out.println("Você acaba de ser eliminado no torneio do Mortal Kombat.");
            classificado = false;
        }
    }

    public void lugarNaTorre (int tamanhoDaTorre){
        if (classificado==true){
            if (vitorias==0){
                System.out.println("Este jogador está no inicio da torre.");
            }
            if (vitorias+1==tamanhoDaTorre){
                System.out.println("Este jogador está contra Shao Kan!");
            }
            if (vitorias==tamanhoDaTorre){
                System.out.println("Este jogador derrotou Shao Kan!");
                System.out.println("PARABÉNS, VOCÊ GANHOU O MORTAL KOMBAT!!!");
                vitorioso=true;
            }
            else{
                System.out.println("Este jogador está no andar "+ (vitorias+1) + " da torre.");
            }    
        }
        else {
            System.out.println("Este jogador foi desclassificado do Mortal Kombat");
        }

    }
    

}
