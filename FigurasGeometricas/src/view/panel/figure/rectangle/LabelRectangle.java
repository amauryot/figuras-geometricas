package view.panel.figure.rectangle;

public enum LabelRectangle {

	BASE(30, 45, 40, 25, "Base:"),
	HEIGHT(200, 45, 50, 25, "Altura:");
	
	private int x;
	private int y;
	private int width;
	private int height;
	private String title;
	
	private LabelRectangle(int x, int y, int width, int height, String title) {
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
