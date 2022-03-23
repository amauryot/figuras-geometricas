package view.subpanel.result;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class SubPanelResult extends JPanel {

	private static final long serialVersionUID = 911816333841499540L;

	private final int SUBPANEL_X      = 10;
	private final int SUBPANEL_Y      = 365;
	private final int SUBPANEL_WIDTH  = 350;
	private final int SUBPANEL_HEIGHT = 80;
	
	private ArrayList<JTextField> textFieldList;
	
	public SubPanelResult() {
		super();
		initialize();
	}
	
	public ArrayList<JTextField> textFieldList() {
		return textFieldList;
	}
	
	private void initialize() {
		
		/* SUBPANEL */
		
		this.setLayout(null);
		this.setBounds(SUBPANEL_X, SUBPANEL_Y, SUBPANEL_WIDTH, SUBPANEL_HEIGHT);
		this.setBorder(new EtchedBorder());
		
		/* FONT */
		
		Font labelFont = new Font("Tahoma", Font.BOLD, 14);
		
		/* LABELS */
		
		for (LabelResult labelEnum : LabelResult.values()) {
			JLabel label = new JLabel(labelEnum.title());
			label.setBounds(labelEnum.x(), labelEnum.y(), labelEnum.width(), labelEnum.height());
			label.setHorizontalAlignment(JLabel.RIGHT);
			label.setFont(labelFont);
			this.add(label);
		}
		
		/* TEXT FIELDS */
		
		textFieldList = new ArrayList<JTextField>();
			
		for (TextFieldResult textFieldEnum : TextFieldResult.values()) {
			JTextField textField = new JTextField();
			textField.setBounds(textFieldEnum.x(), textFieldEnum.y(), textFieldEnum.width(), textFieldEnum.height());
			textField.setBorder(new EtchedBorder());
			textField.setEditable(false);
			this.add(textField);
			textFieldList.add(textField);
		}
	}
}
