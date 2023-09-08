public class LivroLivraria extends Livro{
    private float preco;
    private int estoque;

    public LivroLivraria(Livro livro, float preco, int estoque) {
        super(livro.getNome(), livro.getAutor(), livro.getGenero(), livro.getAno(), livro.getEditora());
        this.preco = preco;
        this.estoque = estoque;
        
    }

    @Override
    public String toString() {
        return "LivroLivraria [preco=" + preco + ", estoque=" + estoque + "] " + super.toString();
    }
}