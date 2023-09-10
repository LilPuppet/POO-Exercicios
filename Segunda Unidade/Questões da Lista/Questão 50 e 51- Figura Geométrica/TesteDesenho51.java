public class TesteDesenho51 {
    public static void main(String[] args) {
		FiguraGeometrica circulo = new Circulo();
		FiguraGeometrica quadrado = new Quadrado();
		FiguraGeometrica triangulo = new Triangulo();
		
		Desenho51 d1 = new Desenho51(circulo, 1, 1, quadrado, 3, 3);
		Desenho51 d2 = new Desenho51(quadrado, 2, 2, triangulo, 4, 4);

        d1.apresenta();
        d2.apresenta();
	}
}
