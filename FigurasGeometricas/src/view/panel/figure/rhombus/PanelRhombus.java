package view.panel.figure.rhombus;

import view.panel.PanelGeometricFigure;

public class PanelRhombus extends PanelGeometricFigure {

	private static final long serialVersionUID = -2627557319045737928L;

	private static final String IMAGE_FILE = "rhombus.png";
	
	private SubPanelDataRhombus subPanelData;
	
	public PanelRhombus() {
		super(IMAGE_FILE);
		initialize();
	}
	
	private void initialize() {
		subPanelData = new SubPanelDataRhombus();
		this.add(subPanelData);
	}
}
