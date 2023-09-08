public class Pessoa {
    private int cpf, rg;
    private String nome;
    
    public Pessoa(int cpf, int rg, String nome) {
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa [cpf=" + cpf + ", rg=" + rg + " nome=" + nome + "]";
    }

}
