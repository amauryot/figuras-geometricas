package view;

import javax.swing.JOptionPane;

public class OptionPane {

	private final String ERROR_TITLE = "Erro";
	private final String MESSAGE_NUMBER_FORMAT_EXCEPTION = "Todos os campos devem ser preenchidos com somente números!";
	private final String MESSAGE_INVALID_CIRCLE_EXCEPTION = "Este valores NÃO formam um CÍRCULO!";
	private final String MESSAGE_INVALID_TRIANGLE_EXCEPTION = "Este valores NÃO formam um TRIÂNGULO!";
	private final String MESSAGE_INVALID_RHOMBUS_EXCEPTION = "Este valores NÃO formam um LOSANGO!";
	private final String MESSAGE_INVALID_SQUARE_EXCEPTION = "Este valores NÃO formam um QUADRADO!";
	private final String MESSAGE_INVALID_RECTANGLE_EXCEPTION = "Este valores NÃO formam um RETÂNGULO!";
	private final String MESSAGE_INVALID_TRAPEZOID_EXCEPTION = "Este valores NÃO formam um TRAPÉZIO!";
	private final String MESSAGE_TITLE = "Sobre Figuras Geométricas";
	private final String MESSAGE_ABOUT = 
		"Figuras Geométricas"
		+ "\nCopyright © Mar 2022"
		+ "\n\nVersão: 1.2.0"
		+ "\n\nAmaury Tavares"
		+ "\namauryot@gmail.com\n\n";
	
	public void showMessageAbout() {
		JOptionPane.showMessageDialog(null, MESSAGE_ABOUT, MESSAGE_TITLE, JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void showMessageNumberFormatException() {
		JOptionPane.showMessageDialog(null, MESSAGE_NUMBER_FORMAT_EXCEPTION, ERROR_TITLE, JOptionPane.ERROR_MESSAGE);
	}
	
	public void showMessageInvalidCircleException() {
		JOptionPane.showMessageDialog(null, MESSAGE_INVALID_CIRCLE_EXCEPTION, ERROR_TITLE, JOptionPane.ERROR_MESSAGE);
	}
	
	public void showMessageInvalidTriangleException() {
		JOptionPane.showMessageDialog(null, MESSAGE_INVALID_TRIANGLE_EXCEPTION, ERROR_TITLE, JOptionPane.ERROR_MESSAGE);
	}
	
	public void showMessageInvalidRhombusException() {
		JOptionPane.showMessageDialog(null, MESSAGE_INVALID_RHOMBUS_EXCEPTION, ERROR_TITLE, JOptionPane.ERROR_MESSAGE);
	}
	
	public void showMessageInvalidSquareException() {
		JOptionPane.showMessageDialog(null, MESSAGE_INVALID_SQUARE_EXCEPTION, ERROR_TITLE, JOptionPane.ERROR_MESSAGE);
	}
	
	public void showMessageInvalidRectangleException() {
		JOptionPane.showMessageDialog(null, MESSAGE_INVALID_RECTANGLE_EXCEPTION, ERROR_TITLE, JOptionPane.ERROR_MESSAGE);
	}
	
	public void showMessageInvalidTrapezoidException() {
		JOptionPane.showMessageDialog(null, MESSAGE_INVALID_TRAPEZOID_EXCEPTION, ERROR_TITLE, JOptionPane.ERROR_MESSAGE);
	}
}
