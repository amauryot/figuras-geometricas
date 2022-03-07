package view.panel.figure.rectangle;

public enum TextFieldRectangle {

	BASE(0, 80, 45, 60, 25),
	HEIGHT(1, 260, 45, 60, 25);
	
	private int index;
	private int x;
	private int y;
	private int width;
	private int height;
	
	private TextFieldRectangle(int index, int x, int y, int width, int height) {
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
