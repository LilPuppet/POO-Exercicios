public class Politico extends Pessoa {
    private String partido;
    private int numPartido;
    
    public Politico(int cpf, int rg, String nome, String partido, int numPartido) {
        super(cpf, rg, nome);
        this.partido = partido;
        this.numPartido = numPartido;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getNumPartido() {
        return numPartido;
    }

    public void setNumPartido(int numPartido) {
        this.numPartido = numPartido;
    }

    @Override
    public String toString() {
        return "Politico [partido=" + partido + ", numPartido=" + numPartido + "]";
    }

}
