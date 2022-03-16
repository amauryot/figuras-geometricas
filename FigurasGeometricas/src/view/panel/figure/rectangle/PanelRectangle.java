package view.panel.figure.rectangle;

import view.panel.PanelGeometricFigure;

public class PanelRectangle extends PanelGeometricFigure {

	private static final long serialVersionUID = -2789612975719797675L;

	private static final String IMAGE_FILE = "rectangle.png";
	
	private SubPanelDataRectangle subPanelData;
	
	public PanelRectangle() {
		super(IMAGE_FILE);
		initialize();
	}
	
	public String getValueOf(TextFieldRectangle textField) {
		return subPanelData.textFieldList().get(textField.index()).getText();
	}
	
	@Override
	public void clear() {
		super.clear();
		subPanelData.textFieldList().forEach(textField -> textField.setText(""));
	}
	
	private void initialize() {
		subPanelData = new SubPanelDataRectangle();
		this.add(subPanelData);
	}
}
