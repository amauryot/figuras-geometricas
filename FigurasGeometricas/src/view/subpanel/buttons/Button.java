package view.subpanel.buttons;

public enum Button {

	CALCULATE(0, "Calcular"),
	CLEAR    (1, "Limpar"  ),
	RETURN   (2, "Voltar"  );
	
	private int index;
	private String title;
	
	private Button(int index, String title) {
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
