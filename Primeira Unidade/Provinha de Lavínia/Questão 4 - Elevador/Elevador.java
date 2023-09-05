public class Elevador {
    private int andar = 0;
    private int tandar;
    private int pessoas = 0;
    private int tpessoas;
    
    // construtor : que deve receber como parâmetros a capacidade do elevador e o total
    //de andares no prédio (um elevador sempre começa no térreo e vazio);
    public Elevador(int tandar, int tpessoas) {
        this.tandar = tandar;
        this.tpessoas = tpessoas;
    }

    //entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda
    //houver espaço);
    public int entra(int i){
        if (i+pessoas<=tpessoas){
            pessoas+=i;
            return pessoas;
        }
        else{
            return pessoas;
        }
    }
    
    //sai : para remover uma pessoa do elevador (só deve remover se houver alguém
    //dentro dele);
    public int sai(int i){
        if (pessoas-i>=0){
            pessoas-=i;
            return pessoas;
        }
        else{
            return pessoas;
        }
    }
    //sobe : para subir um andar (não deve subir se já estiver no último andar);
    public int sobe(int i){
        if (i+andar<=tandar){
            andar+=i;
            return andar;
        }
        else{
            return andar;
        }
    }

    //desce : para descer um andar (não deve descer se já estiver no térreo).
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
