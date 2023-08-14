public class TesteElevador {
    public static void main(String[] args) {
        //construtor:
        Elevador e = new Elevador(5 ,5);
        
        //teste do entra:
        System.out.println(e.entra(2));//tem espaço
        System.out.println(e.entra(3));//tem espaço
        System.out.println(e.entra(2));//não tem, retorna a capacidade

        //teste do sai:
        System.out.println(e.sai(3));//podem sair
        System.out.println(e.sai(3));//não é possível sair, retorna a quantidade
        System.out.println(e.sai(2));//podem sair

        //teste do sobe:
        System.out.println(e.sobe(3));//pode subir
        System.out.println(e.sobe(3));//não pode, retorna o andar
        System.out.println(e.sobe(2));//pode subir

        //teste do desce:
        System.out.println(e.desce(6));//não pode descer, retorna o andar
        System.out.println(e.desce(5));//pode descer

    }
}
