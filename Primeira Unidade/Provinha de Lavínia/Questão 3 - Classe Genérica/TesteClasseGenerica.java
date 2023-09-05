public class TesteClasseGenerica {
    public static void main(String[] args) {
        
        //Teste com o primeiro tipo: INT
        ClasseGenerica <Integer> g = new ClasseGenerica<Integer>(1, 1, 1);
        g.quantosSaoIguais();
        g.imprimir();

        //Teste com o segundo tipo: STRING
        ClasseGenerica <String> h = new ClasseGenerica<String>("Eu", "sou", "linda!");
        h.quantosSaoIguais();
        h.imprimir();

    }
}
