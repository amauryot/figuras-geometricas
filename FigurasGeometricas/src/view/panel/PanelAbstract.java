package view.panel;

import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

import controller.Controller;

public abstract class PanelAbstract extends JPanel {

	private static final long serialVersionUID = -7322054640021398469L;

	private final int PANEL_X      = 0;
	private final int PANEL_Y      = 0;
	private final int PANEL_WIDTH  = 370;
	private final int PANEL_HEIGHT = 515;
	
	public PanelAbstract() {
		super();
		initialize();
	}
	
	public abstract void addController(Controller controller);
	
	private void initialize() {
		this.setLayout(null);
		this.setBounds(PANEL_X, PANEL_Y, PANEL_WIDTH, PANEL_HEIGHT);
		this.setBorder(new EtchedBorder());
	}
}
