public class Governador extends Politico {
    private String estado;

    public Governador(int cpf, int rg, String nome, String partido, int numPartido, String estado){
        super(cpf, rg, nome, partido, numPartido);
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
