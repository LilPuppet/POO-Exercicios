public class Prefeito extends Politico {
    private String cidadeRepresentada;

    public Prefeito(int cpf, int rg, String nome, String partido, int numPartido, String cidadeRepresentada){
        super(cpf, rg, nome, partido, numPartido);
        this.cidadeRepresentada = cidadeRepresentada;
    }

    public String getCidadeRepresentada() {
        return cidadeRepresentada;
    }

    public void setCidadeRepresentada(String cidadeRepresentada) {
        this.cidadeRepresentada = cidadeRepresentada;
    }
}
