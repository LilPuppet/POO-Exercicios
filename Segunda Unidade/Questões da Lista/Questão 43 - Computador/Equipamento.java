public class Equipamento {
    private String nome;
    private String serie;

    public Equipamento(String nome, String serie){
        this.nome = nome;
        this.serie = serie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    
    public String toString(){
        return "Equipamento [nome = " + nome + ", serie = " + serie + "]";
    }
}