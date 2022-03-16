package view.panel.figure.trapezoid;

import view.panel.PanelGeometricFigure;

public class PanelTrapezoid extends PanelGeometricFigure {

	private static final long serialVersionUID = 4176202504469429691L;

	private static final String IMAGE_FILE = "trapezoid.png";
	
	private SubPanelDataTrapezoid subPanelData;
	
	public PanelTrapezoid() {
		super(IMAGE_FILE);
		initialize();
	}
	
	public String getValueOf(TextFieldTrapezoid textField) {
		return subPanelData.textFieldList().get(textField.index()).getText();
	}
	
	@Override
	public void clear() {
		super.clear();
		subPanelData.textFieldList().forEach(textField -> textField.setText(""));
	}
	
	private void initialize() {
		subPanelData = new SubPanelDataTrapezoid();
		this.add(subPanelData);
	}
}
