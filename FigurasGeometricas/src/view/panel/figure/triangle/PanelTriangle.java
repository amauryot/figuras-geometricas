package view.panel.figure.triangle;

import view.panel.PanelGeometricFigure;

public class PanelTriangle extends PanelGeometricFigure {

	private static final long serialVersionUID = 2687671230155815912L;

	private static final String IMAGE_FILE = "triangle.png";
	
	private SubPanelDataTriangle subPanelData;
	
	public PanelTriangle() {
		super(IMAGE_FILE);
		initialize();
	}
	
	private void initialize() {
		subPanelData = new SubPanelDataTriangle();
		this.add(subPanelData);
	}
}
