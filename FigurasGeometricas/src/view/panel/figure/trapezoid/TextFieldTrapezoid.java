package view.panel.figure.trapezoid;

public enum TextFieldTrapezoid {

	MAJOR_BASE(0, 110, 10, 60, 25),
	MINOR_BASE(1, 110, 45, 60, 25),
	SIDE1     (2, 280, 10, 60, 25),
	SIDE2     (3, 280, 45, 60, 25),
	HEIGHT    (4, 110, 80, 60, 25);
	
	private int index;
	private int x;
	private int y;
	private int width;
	private int height;
	
	private TextFieldTrapezoid(int index, int x, int y, int width, int height) {
		this.index = index;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int index() {
		return index;
	}
	
	public int x() {
		return x;
	}
	
	public int y() {
		return y;
	}
	
	public int width() {
		return width;
	}
	
	public int height() {
		return height;
	}
}
