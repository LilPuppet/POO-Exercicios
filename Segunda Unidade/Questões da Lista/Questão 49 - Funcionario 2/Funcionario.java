public class Funcionario{
    private  String nome;
    private double salario, valorHora;

    public Funcionario(String nome){
        super();
        this.nome = nome;
        this.valorHora = 2.0;
    }

    public Funcionario(String nome, double valorHora){
        super();
        this.nome = nome;
        this.valorHora = valorHora
;
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

    public double getValorHora() {
        return valorHora
;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double calcularSalario(double horasTrabalhadas){
        return salario * horasTrabalhadas;
    }
} 

