package view.panel;

import javax.swing.JButton;

import controller.Controller;
import view.subpanel.buttons.Button;
import view.subpanel.buttons.SubPanelButtons;
import view.subpanel.image.SubPanelImage;
import view.subpanel.result.SubPanelResult;
import view.subpanel.result.TextFieldResult;

public abstract class PanelGeometricFigure extends PanelAbstract {

	private static final long serialVersionUID = -2546418151311283361L;

	private SubPanelImage subPanelImage;
	private SubPanelResult subPanelResult;
	private SubPanelButtons subPanelButtons;
	
	public PanelGeometricFigure(String imageFile) {
		super();
		initialize(imageFile);
	}
	
	public JButton getButton(Button button) {
		return subPanelButtons.buttonList().get(button.index());
	}
	
	public void clear() {
		subPanelResult.textFieldList().forEach(textField -> textField.setText(""));
	}
	
	public void setResults(String perimeter, String area) {
		subPanelResult.textFieldList().get(TextFieldResult.PERIMETER.index()).setText(perimeter);
		subPanelResult.textFieldList().get(TextFieldResult.AREA.index()).setText(area);
	}
	
	@Override
	public void addController (Controller controller) {
		subPanelButtons.buttonList().forEach(button -> button.addActionListener(controller));
	}
	
	private void initialize(String imageFile) {
		subPanelImage = new SubPanelImage(imageFile);
		this.add(subPanelImage);
		
		subPanelResult = new SubPanelResult();
		this.add(subPanelResult);
		
		subPanelButtons = new SubPanelButtons();
		this.add(subPanelButtons);
	}
}
