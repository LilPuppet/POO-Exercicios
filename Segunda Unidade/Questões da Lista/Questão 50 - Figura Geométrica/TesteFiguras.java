public class TesteFiguras {
    public static void main(String[] args) {
		FiguraGeometrica circulo = new Circulo();
		FiguraGeometrica quadrado = new Quadrado();
		FiguraGeometrica triangulo = new Triangulo();
		
		circulo.desenha();
		triangulo.desenha();
		quadrado.desenha();
	}
}
