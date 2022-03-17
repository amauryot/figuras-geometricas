package view;

import javax.swing.JOptionPane;

public class OptionPane {

	private final String ERROR_TITLE = "Erro";
	private final String MESSAGE_NUMBER_FORMAT_EXCEPTION = "Todos os campos devem ser preenchidos com somente n�meros!";
	private final String MESSAGE_INVALID_CIRCLE_EXCEPTION = "Este valores N�O formam um C�RCULO!";
	private final String MESSAGE_INVALID_TRIANGLE_EXCEPTION = "Este valores N�O formam um TRI�NGULO!";
	private final String MESSAGE_INVALID_RHOMBUS_EXCEPTION = "Este valores N�O formam um LOSANGO!";
	private final String MESSAGE_INVALID_SQUARE_EXCEPTION = "Este valores N�O formam um QUADRADO!";
	private final String MESSAGE_INVALID_RECTANGLE_EXCEPTION = "Este valores N�O formam um RET�NGULO!";
	private final String MESSAGE_INVALID_TRAPEZOID_EXCEPTION = "Este valores N�O formam um TRAP�ZIO!";
	private final String MESSAGE_TITLE = "Sobre Figuras Geom�tricas";
	private final String MESSAGE_ABOUT = 
		"Figuras Geom�tricas"
		+ "\nCopyright � Mar 2022"
		+ "\n\nVers�o: 1.2.0"
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
