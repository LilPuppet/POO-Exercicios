public class RegistroAcademico {
    private String nome;
    private String matricula;
    private int codigoCurso;
    private double percentualDeCobranca;

    public void inicializaRegistroAcademico(String n, String m, int cod, double perc) {
        nome = n;
        matricula = m;
        codigoCurso = cod;
        percentualDeCobranca = perc;
    }

    public double calculaMensalidade() {
        System.out.println(nome + matricula);
        return 100 * codigoCurso * percentualDeCobranca;
    }
}
