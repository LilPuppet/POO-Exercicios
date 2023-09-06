public class Produto {
    public static int produtoDaSerie(int ...numeros) {
        int produto = 1;

        for(int numero: numeros){
            produto *= numero;
        }
        return produto;
    }

    public static void main(String[] args) {
        int produto = produtoDaSerie(3, 2);
        System.out.println (produto);
    }
}