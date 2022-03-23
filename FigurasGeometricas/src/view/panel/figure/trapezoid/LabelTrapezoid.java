package view.panel.figure.trapezoid;

public enum LabelTrapezoid {

	MAJOR_BASE(10,  10, 90, 25, "Base Maior:"),
	MINOR_BASE(10,  45, 90, 25, "Base Menor:"),
	SIDE1     (180, 10, 90, 25, "Lado 1:"    ),
	SIDE2     (180, 45, 90, 25, "Lado 2:"    ),
	HEIGHT    (10,  80, 90, 25, "Altura:"    );
	
	private int x;
	private int y;
	private int width;
	private int height;
	private String title;
	
	private LabelTrapezoid(int x, int y, int width, int height, String title) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.title = title;
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
	
	public String title() {
		return title;
	}
}
