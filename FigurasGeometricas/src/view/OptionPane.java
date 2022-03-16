package view;

import javax.swing.JOptionPane;

public class OptionPane {

	private final String MESSAGE_TITLE = "Sobre Figuras Geométricas";
	private final String MESSAGE_ABOUT = 
		"Figuras Geométricas"
		+ "\nCopyright © Mar 2022"
		+ "\n\nVersão: 1.0.0"
		+ "\n\nAmaury Tavares"
		+ "\namauryot@gmail.com\n\n";
	
	public void showMessageAbout() {
		JOptionPane.showMessageDialog(null, MESSAGE_ABOUT, MESSAGE_TITLE, JOptionPane.INFORMATION_MESSAGE);
	}
}
