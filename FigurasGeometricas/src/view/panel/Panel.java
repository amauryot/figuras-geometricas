package view.panel;

import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public abstract class Panel extends JPanel {

	private static final long serialVersionUID = -7322054640021398469L;

	private final int PANEL_X = 0;
	private final int PANEL_Y = 0;
	private final int PANEL_WIDTH = 370;
	private final int PANEL_HEIGHT = 515;
	
	public Panel() {
		super();
		initialize();
	}
	
	private void initialize() {
		this.setLayout(null);
		this.setBounds(PANEL_X, PANEL_Y, PANEL_WIDTH, PANEL_HEIGHT);
		this.setBorder(new EtchedBorder());
	}
}
