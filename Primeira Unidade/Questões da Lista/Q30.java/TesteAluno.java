public class TesteAluno {
    public static void main(String[] args) {
        Aluno a = new Aluno (1, "A", 0,5,10);
        System.out.println(a.media());
        System.out.println(a.provaFinal(a.media()));
    }
}
