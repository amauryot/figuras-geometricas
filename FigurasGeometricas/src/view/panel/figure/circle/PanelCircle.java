package view.panel.figure.circle;

import view.panel.PanelGeometricFigure;

public class PanelCircle extends PanelGeometricFigure {

	private static final long serialVersionUID = -5287285927614576565L;

	private static final String IMAGE_FILE = "circle.png";
	
	private SubPanelDataCircle subPanelData;
	
	public PanelCircle() {
		super(IMAGE_FILE);
		initialize();
	}
	
	public String getValueOf(TextFieldCircle textField) {
		return subPanelData.textFieldList().get(textField.index()).getText();
	}
	
	@Override
	public void clear() {
		super.clear();
		subPanelData.textFieldList().forEach(textField -> textField.setText(""));
	}
	
	private void initialize() {
		subPanelData = new SubPanelDataCircle();
		this.add(subPanelData);
	}
}
