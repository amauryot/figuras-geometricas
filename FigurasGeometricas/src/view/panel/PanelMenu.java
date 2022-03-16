package view.panel;

import view.subpanel.image.SubPanelImage;

public abstract class PanelMenu extends PanelAbstract {

	private static final long serialVersionUID = -7322054640021398469L;
	
	private SubPanelImage subPanelImage;
	
	public PanelMenu(String imageFile) {
		super();
		initialize(imageFile);
	}
	
	private void initialize(String imageFile) {
		subPanelImage = new SubPanelImage(imageFile);
		this.add(subPanelImage);
	}
}
