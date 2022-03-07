package view.panel.menu.main;

public enum ButtonMain {

	CIRCLE(0, "Círculo"),
	TRIANGLE(1, "Triângulo"),
	QUADRILATERALS(2, "Quadriláteros"),
	EXIT(3, "Sair");
	
	private int index;
	private String title;
	
	private ButtonMain(int index, String title) {
		this.index = index;
		this.title = title;
	}
	
	public int index() {
		return index;
	}
	
	public String title() {
		return title;
	}
}
