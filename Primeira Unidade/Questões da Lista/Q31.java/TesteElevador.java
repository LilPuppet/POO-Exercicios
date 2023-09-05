public class TesteElevador {
    public static void main(String[] args) {
        Elevador e = new Elevador(5 ,5);
        System.out.println(e.entra(2));
        System.out.println(e.sai(3));
        System.out.println(e.sobe(3));
        System.out.println(e.desce(6));

    }
}
