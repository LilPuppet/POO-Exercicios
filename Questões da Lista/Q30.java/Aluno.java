public class Aluno {
    private int mat;
    private String nome;
    private double n1;
    private double n2;
    private double nt;
    
    public Aluno(int mat, String nome, double n1, double n2, double nt) {
        this.mat = mat;
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
        this.nt = nt;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getNt() {
        return nt;
    }

    public void setNt(double nt) {
        this.nt = nt;
    }

    public double media (){
        return (n1*2.5+n2*2.5+nt*2)/7;
    }

    public double provaFinal(double media){
        if (media<3.0){
            return 0.0;
        }
        if (media>=3.0 && media<7){
            return 10-media;
        }
        else{
            return 0.0;
        }
    }
}
