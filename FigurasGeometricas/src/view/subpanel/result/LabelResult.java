package view.subpanel.result;

public enum LabelResult {

	PERIMETER(95, 10, 80, 25, "Perímetro"),
	AREA     (95, 45, 80, 25, "Área"     );
	
	private int x;
	private int y;
	private int width;
	private int height;
	private String title;
	
	private LabelResult(int x, int y, int width, int height, String title) {
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
