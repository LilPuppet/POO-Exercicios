public class RegistroAcademico {
    public String nome;
    private int matricula;
    private int codigoCurso;
    private double percentualDeCobranca;
    private static int numeroDeMatriculas = 0;


    public void inicializaRegistroAcademico(String n, int cod, double perc) {
        nome = n;
        numeroDeMatriculas++;
        matricula = 202300 + numeroDeMatriculas;
        codigoCurso = cod;
        percentualDeCobranca = perc;
    }

    public double calculaMensalidade() {
        return 100 * codigoCurso * percentualDeCobranca;
    }

    public void imprimeAluno(){
        System.out.println("A matrícula de "+ nome +" é "+matricula);
    }
}