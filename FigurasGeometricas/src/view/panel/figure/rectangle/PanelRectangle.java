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
	
	private void initialize() {
		subPanelData = new SubPanelDataRectangle();
		this.add(subPanelData);
	}
}
