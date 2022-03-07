package view.panel.menu.main;

import view.panel.PanelMenu;

public class PanelMenuMain extends PanelMenu {

	private static final long serialVersionUID = 7197790294938740847L;
	
	private static final String IMAGE_FILE = "figures.png";
	
	private SubPanelButtonsMain subPanelButtonsMain;
	
	public PanelMenuMain() {
		super(IMAGE_FILE);
		initialize();
	}
	
	private void initialize() {
		subPanelButtonsMain = new SubPanelButtonsMain();
		this.add(subPanelButtonsMain);
	}
}
