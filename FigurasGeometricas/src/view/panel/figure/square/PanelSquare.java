package view.panel.figure.square;

import view.panel.PanelGeometricFigure;

public class PanelSquare extends PanelGeometricFigure {

	private static final long serialVersionUID = -4985879795245953041L;

	private static final String IMAGE_FILE = "square.png";
	
	private SubPanelDataSquare subPanelData;
	
	public PanelSquare() {
		super(IMAGE_FILE);
		initialize();
	}
	
	private void initialize() {
		subPanelData = new SubPanelDataSquare();
		this.add(subPanelData);
	}
}
