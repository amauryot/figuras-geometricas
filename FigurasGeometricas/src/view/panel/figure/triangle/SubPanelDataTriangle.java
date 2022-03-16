package view.panel.figure.triangle;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextField;

import view.subpanel.data.SubPanelData;

public class SubPanelDataTriangle extends SubPanelData {

	private static final long serialVersionUID = 7053336638868073538L;

	public SubPanelDataTriangle() {
		super();
		initialize();
	}
	
	private void initialize() {

		/* FONT */
		
		Font labelFont = new Font("Tahoma", Font.BOLD, 14);
		
		/* LABELS */
		
		for (LabelTriangle labelEnum: LabelTriangle.values()) {
			JLabel label = new JLabel(labelEnum.title());
			label.setBounds(labelEnum.x(), labelEnum.y(), labelEnum.width(), labelEnum.height());
			label.setHorizontalAlignment(JLabel.RIGHT);
			label.setFont(labelFont);
			this.add(label);
		}
		
		/* TEXT FIELDS */
		
		textFieldList = new ArrayList<JTextField>();
		
		for (TextFieldTriangle textFieldEnum : TextFieldTriangle.values()) {
			JTextField textField = new JTextField();
			textField.setBounds(textFieldEnum.x(), textFieldEnum.y(), textFieldEnum.width(), textFieldEnum.height());
			this.add(textField);
			textFieldList.add(textField);
		}
	}
}
