package view.panel.figure.rhombus;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextField;

import view.subpanel.data.SubPanelData;

public class SubPanelDataRhombus extends SubPanelData {

	private static final long serialVersionUID = 8053607220396686642L;

	public SubPanelDataRhombus() {
		super();
		initialize();
	}
	
	private void initialize() {

		/* FONT */
		
		Font labelFont = new Font("Tahoma", Font.BOLD, 14);
		
		/* LABELS */
		
		for (LabelRhombus labelEnum: LabelRhombus.values()) {
			JLabel label = new JLabel(labelEnum.title());
			label.setBounds(labelEnum.x(), labelEnum.y(), labelEnum.width(), labelEnum.height());
			label.setHorizontalAlignment(JLabel.RIGHT);
			label.setFont(labelFont);
			this.add(label);
		}
		
		/* TEXT FIELDS */
		
		textFieldList = new ArrayList<JTextField>();
		
		for (TextFieldRhombus textFieldEnum : TextFieldRhombus.values()) {
			JTextField textField = new JTextField();
			textField.setBounds(textFieldEnum.x(), textFieldEnum.y(), textFieldEnum.width(), textFieldEnum.height());
			this.add(textField);
		}
	}
}
