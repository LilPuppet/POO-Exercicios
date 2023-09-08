public class Tecnico extends Assistente{
    private double bonus;

    public Tecnico(String nome, double salario, String matricula, double bonus){
        super(nome, salario, matricula);
        this.bonus = bonus;
    }

    public double ganhoAnual(){
        return super.ganhoAnual() + bonus;
    }

    @Override

    public String toString(){
        return super.toString() + "Bonus salarial: R$ " + bonus + "";
    }
}
