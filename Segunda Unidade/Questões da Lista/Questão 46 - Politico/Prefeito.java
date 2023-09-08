public class Prefeito extends Politico {
    private String cidade;

    public Prefeito(int cpf, int rg, String nome, String partido, int numPartido, String cidade){
        super(cpf, rg, nome, partido, numPartido);
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
