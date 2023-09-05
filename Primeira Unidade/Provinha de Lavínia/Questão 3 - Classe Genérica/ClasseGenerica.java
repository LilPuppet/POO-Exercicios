public class ClasseGenerica <TipoAtributo> { //As boquinhas de jacaré permitem que a classe seja escolhida posteriormente, tornando essa classe genérica
    private TipoAtributo a1;
    private TipoAtributo a2;
    private TipoAtributo a3;
    
    //Construtor
    public ClasseGenerica(TipoAtributo a1, TipoAtributo a2, TipoAtributo a3){
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    //Sysouts para imprimir os valores privados
    public void imprimir(){
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }

    //Contador que soma quantos iguais existem
    public int quantosSaoIguais(){
        int cont = 0;
        if (a1.equals(a2)) {
            cont++;
            }
        if (a1.equals(a3)) {
            cont++;
        }
        if (a2.equals(a3)) {
            cont++;
        }
            System.out.println(cont);//pra não ter que imprimir o retorno, só chamar
            return cont;
    }

    

}
