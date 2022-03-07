package view.subpanel.data;

import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public abstract class SubPanelData extends JPanel {

	private static final long serialVersionUID = -3335304333429302459L;

	private final int SUBPANEL_X = 10;
	private final int SUBPANEL_Y = 240;
	private final int SUBPANEL_WIDTH = 350;
	private final int SUBPANEL_HEIGHT = 115;
	
	protected ArrayList<JTextField> textFieldList;
	
	public SubPanelData() {
		super();
		initialize();
	}
	
	public ArrayList<JTextField> textFieldList() {
		return textFieldList;
	}
	
	private void initialize() {
		this.setLayout(null);
		this.setBounds(SUBPANEL_X, SUBPANEL_Y, SUBPANEL_WIDTH, SUBPANEL_HEIGHT);
		this.setBorder(new EtchedBorder());
	}
}
