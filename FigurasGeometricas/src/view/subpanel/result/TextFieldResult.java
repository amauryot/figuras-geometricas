package view.subpanel.result;

public enum TextFieldResult {

	PERIMETER(0, 185, 10, 70, 25),
	AREA(1, 185, 45, 70, 25);
	
	private int index;
	private int x;
	private int y;
	private int width;
	private int height;
	
	private TextFieldResult(int index, int x, int y, int width, int height) {
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
