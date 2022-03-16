package view.panel;

public enum Panel {

	MENU_MAIN(0),
	MENU_QUADRILATERALS(1),
	CIRCLE(2),
	TRIANGLE(3),
	RHOMBUS(4),
	SQUARE(5),
	RECTANGLE(6),
	TRAPEZOID(7);
	
	private int index;
	
	private Panel(int index) {
		this.index = index;
	}
	
	public int index() {
		return index;
	}
}
