public class Elevador {
    private int andar = 0;
    private int tandar;
    private int pessoas = 0;
    private int tpessoas;
    
    public Elevador(int tandar, int tpessoas) {
        this.tandar = tandar;
        this.tpessoas = tpessoas;
    }

    public int entra(int i){
        if (i+pessoas<=tpessoas){
            pessoas+=i;
            return pessoas;
        }
        else{
            return pessoas;
        }
    }
    
    public int sai(int i){
        if (pessoas-i>=0){
            pessoas-=i;
            return pessoas;
        }
        else{
            return pessoas;
        }
    }

    public int sobe(int i){
        if (i+andar<=tandar){
            andar+=i;
            return andar;
        }
        else{
            return andar;
        }
    }

    public int desce(int i){
        if(andar-i>=0){
            andar-=i;
            return andar;
        }
        else{
            return andar;
        }
    }
}
