public class Cliente {
    private String nome;
    private int id;
    private int idade;
    private int telefone;

    public Cliente(String nome, int id, int idade, int telefone) {
        this.nome = nome;
        this.id = id;
        this.idade = idade;
        this.telefone = telefone;
    }
    public void setCliente(String nome, int id, int idade, int telefone) {
        this.nome = nome;
        this.id = id;
        this.idade = idade;
        this.telefone = telefone;
    }
    public String toString() {
        return "Cliente [nome=" + nome + ", id=" + id + ", idade=" + idade + ", telefone=" + telefone + "]";
    }
}
