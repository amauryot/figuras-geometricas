package view.panel.figure.rhombus;

public enum LabelRhombus {

	MAJOR_DIAGONAL(10, 20, 120, 25, "Diagonal Maior:"),
	MINOR_DIAGONAL(10, 70, 120, 25, "Diagonal Menor:"),
	SIDE(230, 20, 40, 25, "Lado:");
	
	private int x;
	private int y;
	private int width;
	private int height;
	private String title;
	
	private LabelRhombus(int x, int y, int width, int height, String title) {
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
