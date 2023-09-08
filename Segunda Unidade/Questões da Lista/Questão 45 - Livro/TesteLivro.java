public class TesteLivro {
    public static void main(String[] args) {
        Livro livro = new Livro("Admirável Mundo Novo", "Aldous Huxley", "Romance","2014","Renata");
        LivroLivraria l = new LivroLivraria(livro, 50, 2);
        LivroBiblioteca b = new LivroBiblioteca(livro, 5, 3, false);
        
        System.out.println(livro);
        System.out.println(l);
        System.out.println(b);
    }
}
