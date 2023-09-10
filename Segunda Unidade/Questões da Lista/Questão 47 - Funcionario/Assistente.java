public class Assistente extends Funcionario{
    private String matricula;
    
    public Assistente(String nome, double salario, String matricula){
       super(nome, salario);
        this.matricula = matricula;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double ganhoAnual(){
        return getSalario() * 13; //por causa do 13°
    }
    
    @Override
    
    public String toString(){
        return "Assistente [Matricula: " + matricula + "]";
    }
}

