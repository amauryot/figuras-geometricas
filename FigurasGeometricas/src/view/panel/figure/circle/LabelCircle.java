package view.panel.figure.circle;

public enum LabelCircle {

	RADIUS(120, 45, 40, 25, "Raio:");
	
	private int x;
	private int y;
	private int width;
	private int height;
	private String title;
	
	private LabelCircle(int x, int y, int width, int height, String title) {
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
