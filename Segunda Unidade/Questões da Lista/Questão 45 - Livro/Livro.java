public class Livro {
    private String nome;
    private String autor;
    private String genero;
    private String ano;
    private String editora;

    public Livro(String nome, String autor, String genero, String ano, String editora) {
        this.nome = nome;
        this.autor = autor;
        this.genero = genero;
        this.ano = ano;
        this.editora = editora;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public String getAno() {
        return ano;
    }

    public String getEditora() {
        return editora;
    }

    @Override
    public String toString() {
        return "Livro [nome=" + nome + ", autor=" + autor + ", genero=" + genero + ", ano=" + ano + ", editora=" + editora + "]";
    }

}
