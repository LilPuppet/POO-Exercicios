public class TesteLampadaContador {
    public static void main(String[] args) {
        Lampada l = new Lampada();
        l.acende();
        l.apaga();
        l.mostraEstado();
        l.acende();
        System.out.println(l.estaLigada());
        l.quantas();
    }
}
