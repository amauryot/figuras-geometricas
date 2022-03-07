package view.panel.menu.quadrilaterals;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class SubPanelButtonsQuadrilaterals extends JPanel {

	private static final long serialVersionUID = -8216453375421201390L;

	private final int GRID_ROWS = 5;
	private final int GRID_COLS = 1;
	private final int GRID_HGAP = 0;
	private final int GRID_VGAP= 20;
	private final int SUBPANEL_X = 135;
	private final int SUBPANEL_Y = 260;
	private final int SUBPANEL_WIDTH = 100;
	private final int SUBPANEL_HEIGHT = 230;
	
	private ArrayList<JButton> buttonList;
	
	public SubPanelButtonsQuadrilaterals() {
		super();
		initialize();
	}
	
	public ArrayList<JButton> buttonList() {
		return buttonList;
	}
	
	private void initialize() {
		
		/* SUBPANEL */
		
		this.setLayout(new GridLayout(GRID_ROWS, GRID_COLS, GRID_HGAP, GRID_VGAP));
		this.setBounds(SUBPANEL_X, SUBPANEL_Y, SUBPANEL_WIDTH, SUBPANEL_HEIGHT);
		
		/* FONT */
		
		Font buttonFont = new Font("Tahoma", Font.BOLD, 12);
		
		/* BUTTONS */
		
		buttonList = new ArrayList<JButton>();
		
		for (ButtonQuadrilaterals buttonEnum : ButtonQuadrilaterals.values()) {
			JButton button = new JButton(buttonEnum.title());
			button.setMargin(new Insets(0, 0, 0, 0));
			button.setFont(buttonFont);
			button.setFocusable(false);
			this.add(button);
			buttonList.add(button);
		}
	}
}
