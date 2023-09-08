public class LivroBiblioteca extends Livro{
    private int plateleira;
    private int corredor;
    private boolean emprestado;

    public LivroBiblioteca(Livro livro, int plateleira, int corredor, boolean emprestado) {
        super(livro.getNome(), livro.getAutor(), livro.getGenero(), livro.getAno(), livro.getEditora());
        this.plateleira = plateleira;
        this.corredor = corredor;
        this.emprestado = emprestado;
    }

    @Override
    public String toString() {
        return "LivroBiblioteca [plateleira=" + plateleira + ", corredor=" + corredor + ", emprestado=" + emprestado +  "] "+ super.toString();
    }
    
}
