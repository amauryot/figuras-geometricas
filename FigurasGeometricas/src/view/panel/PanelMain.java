package view.panel;

import javax.swing.JPanel;

public class PanelMain extends JPanel {

	private static final long serialVersionUID = -8107734434680000106L;

	private final int PANEL_X = 10;
	private final int PANEL_Y = 10;
	private final int PANEL_WIDTH = 370;
	private final int PANEL_HEIGHT = 515;
	
	public PanelMain() {
		super();
		initialize();
	}
	
	private void initialize() {
		this.setLayout(null);
		this.setBounds(PANEL_X, PANEL_Y, PANEL_WIDTH, PANEL_HEIGHT);
	}
}
