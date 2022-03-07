package view.panel.figure.triangle;

public enum LabelTriangle {

	BASE(20, 20, 50, 25, "Base:"),
	HEIGHT(20, 70, 50, 25, "Altura:"),
	SIDE1(205, 20, 55, 25, "Lado 1:"),
	SIDE2(205, 70, 55, 25, "Lado 2:");
	
	private int x;
	private int y;
	private int width;
	private int height;
	private String title;
	
	private LabelTriangle(int x, int y, int width, int height, String title) {
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
