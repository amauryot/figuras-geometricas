package view.subpanel.image;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SubPanelImage extends JPanel {

	private static final long serialVersionUID = 1304328439944661736L;
	
	private final int SUBPANEL_X      = 30;
	private final int SUBPANEL_Y      = 15;
	private final int SUBPANEL_WIDTH  = 310;
	private final int SUBPANEL_HEIGHT = 210;
	
	public SubPanelImage(String imageFile) {
		super();
		initialize(imageFile);
	}
	
	private void initialize(String imageFile) {
		
		/* SUBPANEL */
		
		this.setLayout(new BorderLayout());
		this.setBounds(SUBPANEL_X, SUBPANEL_Y, SUBPANEL_WIDTH, SUBPANEL_HEIGHT);
		
		/* LABEL */
		
		JLabel labelImage = new JLabel();
		labelImage.setHorizontalAlignment(JLabel.CENTER);
		this.add(labelImage);
		
		ImageIcon image = new ImageIcon(ClassLoader.getSystemResource(imageFile));
		labelImage.setIcon(image);
	}
}
