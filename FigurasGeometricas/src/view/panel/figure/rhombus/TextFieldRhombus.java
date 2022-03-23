package view.panel.figure.rhombus;

public enum TextFieldRhombus {

	MAJOR_DIAGONAL(0, 140, 20, 60, 25),
	MINOR_DIAGONAL(1, 140, 70, 60, 25),
	SIDE          (2, 280, 20, 60, 25);
	
	private int index;
	private int x;
	private int y;
	private int width;
	private int height;
	
	private TextFieldRhombus(int index, int x, int y, int width, int height) {
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
