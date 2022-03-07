package view.panel.menu.quadrilaterals;

import view.panel.PanelMenu;

public class PanelMenuQuadrilaterals extends PanelMenu {

	private static final long serialVersionUID = 5163898696177705032L;

	private static final String IMAGE_FILE = "quadrilaterals.png";
	
	private SubPanelButtonsQuadrilaterals subPanelButtonsQuadrilaterals;
	
	public PanelMenuQuadrilaterals() {
		super(IMAGE_FILE);
		initialize();
	}
	
	private void initialize() {
		subPanelButtonsQuadrilaterals = new SubPanelButtonsQuadrilaterals();
		this.add(subPanelButtonsQuadrilaterals);
	}
}
