public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        super();
        this.nome = nome;
        this.salario = salario;
    }

    public double aumentarSalario(double aumento){
        return salario += aumento;
    }

    public double ganhoAnual(){
        return this.salario * 13; //por causa do 13°
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override

    public String toString(){
        return "Funcionario [Nome: " + nome + ", salario: " + salario + ", ganho anual: " + ganhoAnual() + "]";
    }
}