public class Computador extends Equipamento {
    private String tipo;
    private String marca;

    public Computador(String nome, String serie, String tipo, String marca){
        super(nome, serie);
        this.tipo = tipo;
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override

    public String toString(){
        return "Computador [tipo = " + tipo + ", marca = " + marca + ", nome = " + getNome() + ", serie = " + getSerie() + "]";
    }
}