public class Governador extends Politico {
    private String estadoRepresentado;

    public Governador(int cpf, int rg, String nome, String partido, int numPartido, String estadoRepresentado){
        super(cpf, rg, nome, partido, numPartido);
        this.estadoRepresentado = estadoRepresentado;
    }

    public String getEstadoRepresentado() {
        return estadoRepresentado;
    }

    public void setEstadoRepresentado(String estadoRepresentado) {
        this.estadoRepresentado = estadoRepresentado;
    }
}
