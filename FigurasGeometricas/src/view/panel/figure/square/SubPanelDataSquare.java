package view.panel.figure.square;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextField;

import view.subpanel.data.SubPanelData;

public class SubPanelDataSquare extends SubPanelData {

	private static final long serialVersionUID = 2719783360915335166L;

	public SubPanelDataSquare() {
		super();
		initialize();
	}
	
	private void initialize() {

		/* FONT */
		
		Font labelFont = new Font("Tahoma", Font.BOLD, 14);
		
		/* LABELS */
		
		for (LabelSquare labelEnum: LabelSquare.values()) {
			JLabel label = new JLabel(labelEnum.title());
			label.setBounds(labelEnum.x(), labelEnum.y(), labelEnum.width(), labelEnum.height());
			label.setHorizontalAlignment(JLabel.RIGHT);
			label.setFont(labelFont);
			this.add(label);
		}
		
		/* TEXT FIELDS */
		
		textFieldList = new ArrayList<JTextField>();
		
		for (TextFieldSquare textFieldEnum : TextFieldSquare.values()) {
			JTextField textField = new JTextField();
			textField.setBounds(textFieldEnum.x(), textFieldEnum.y(), textFieldEnum.width(), textFieldEnum.height());
			this.add(textField);
		}
	}
}
