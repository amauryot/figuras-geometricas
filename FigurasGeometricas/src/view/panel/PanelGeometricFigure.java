package view.panel;

import view.subpanel.buttons.SubPanelButtons;
import view.subpanel.image.SubPanelImage;
import view.subpanel.result.SubPanelResult;

public abstract class PanelGeometricFigure extends Panel {

	private static final long serialVersionUID = -2546418151311283361L;

	private SubPanelImage subPanelImage;
	private SubPanelResult subPanelResult;
	private SubPanelButtons subPanelButtons;
	
	public PanelGeometricFigure(String imageFile) {
		super();
		initialize(imageFile);
	}
	
	private void initialize(String imageFile) {
		subPanelImage = new SubPanelImage(imageFile);
		this.add(subPanelImage);
		
		subPanelResult = new SubPanelResult();
		this.add(subPanelResult);
		
		subPanelButtons = new SubPanelButtons();
		this.add(subPanelButtons);
	}
}
