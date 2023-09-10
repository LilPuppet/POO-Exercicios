public class Desenho51{
    private FiguraGeometrica f1;
	private FiguraGeometrica f2;
	private int x1, y1;
	private int x2, y2;
	
    public Desenho51(FiguraGeometrica f1, int x1, int y1, FiguraGeometrica f2,  int x2, int y2) {
		super();
		this.f1 = f1;
		this.f2 = f2;
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public void apresenta() {
		System.out.println("Primeira Figura: ");
		System.out.println("X = " + x1+ " Y = " + y1);
		f1.desenha();
		System.out.println();
		System.out.println("Segunda Figura: ");
		System.out.println("X = " + x2+ " Y = " + y2);
		f2.desenha();
		System.out.println();
	}
}
