//package tabuleiro;
public class JogoDeDamas {
    private char[][] tabuleiro;
    public static int NLIN = 8;
    public static int NCOL = 8;
    public static int MAXX = 3;
    public static int MINO = 5;

    JogoDeDamas(){
        tabuleiro = new char[NLIN][NCOL];
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j]= '.';
            }
        }
        //peças X
        for (int i = 0; i < MAXX; i++) {
            for (int j = i%2; j < NCOL; j+=2) {
                tabuleiro[i][j] = 'x';
            }
        }
        //peças O
        for (int i = MINO; i < NCOL; i++) {
            for (int j = i%2; j < NCOL; j+=2) {
                tabuleiro[i][j] = 'o';
            }
        }
    }

    public String toString(){
        String rep = "";
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                rep+= tabuleiro[i][j] + " " ;
            }
            rep += "\n";
        }
        return rep;
    }


}
