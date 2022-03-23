package view.panel.figure.triangle;

public enum TextFieldTriangle {

	BASE  (0, 80,  20, 60, 25),
	HEIGHT(1, 80,  70, 60, 25),
	SIDE1 (2, 270, 20, 60, 25),
	SIDE2 (3, 270, 70, 60, 25);
	
	private int index;
	private int x;
	private int y;
	private int width;
	private int height;
	
	private TextFieldTriangle(int index, int x, int y, int width, int height) {
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
