public class Administrativo extends Assistente{
    private int turno;
    private double extraNoite;

    public Administrativo(String nome, double salario, String matricula, int turno, double extraNoite){
        super(nome, salario, matricula);
        this.turno = turno;
        this.extraNoite = extraNoite;
    }

    public double ganhoAnual(){
        double ganho = super.ganhoAnual();
        if(turno == 2){
            ganho += extraNoite * 12;
        }
        return ganho;
    }

    @Override

    public String toString(){
        return super.toString() + "Turno: " + turno + ", adicional noturno " + extraNoite + "";
    }
}