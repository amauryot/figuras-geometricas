package view.panel.menu.main;

import javax.swing.JButton;

import controller.Controller;
import view.panel.PanelMenu;

public class PanelMenuMain extends PanelMenu {

	private static final long serialVersionUID = 7197790294938740847L;
	
	private static final String IMAGE_FILE = "figures.png";
	
	private SubPanelButtonsMain subPanelButtonsMain;
	
	public PanelMenuMain() {
		super(IMAGE_FILE);
		initialize();
	}
	
	public JButton getButton(ButtonMain button) {
		return subPanelButtonsMain.buttonList().get(button.index());
	}
	
	@Override
	public void addController (Controller controller) {
		subPanelButtonsMain.buttonList().forEach(button -> button.addActionListener(controller));
	}
	
	private void initialize() {
		subPanelButtonsMain = new SubPanelButtonsMain();
		this.add(subPanelButtonsMain);
	}
}
