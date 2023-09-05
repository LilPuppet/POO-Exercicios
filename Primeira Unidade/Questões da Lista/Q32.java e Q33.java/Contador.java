public class Contador{
    private int cont;

    public Contador() {
        this.cont = 0;
    }

    public void contar(){
        cont++;
    }

    public void zerar(){
        cont = 0;
    }

    public void imprimir(){
        System.out.println(cont);
    }

    public int retornar(){
        return cont;
    }
}
