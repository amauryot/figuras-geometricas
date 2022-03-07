package view.panel.menu.main;

public enum ButtonMain {

	CIRCLE(0, "C�rculo"),
	TRIANGLE(1, "Tri�ngulo"),
	QUADRILATERALS(2, "Quadril�teros"),
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
