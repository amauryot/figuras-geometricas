package view.panel.figure.circle;

public enum TextFieldCircle {

	RADIUS(0, 170, 45, 60, 25);
	
	private int index;
	private int x;
	private int y;
	private int width;
	private int height;
	
	private TextFieldCircle(int index, int x, int y, int width, int height) {
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
