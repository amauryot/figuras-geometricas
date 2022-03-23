package view.panel.menu.quadrilaterals;

public enum ButtonQuadrilaterals {

	RHOMBUS  (0, "Losango"  ),
	SQUARE   (1, "Quadrado" ),
	RECTANGLE(2, "Retângulo"),
	TRAPEZOID(3, "Trapézio" ),
	RETURN   (4, "Voltar"   );
	
	private int index;
	private String title;
	
	private ButtonQuadrilaterals(int index, String title) {
		this.index = index;
		this.title = title;
	}
	
	public int index() {
		return index;
	}
	
	public String title() {
		return title;
	}
}
