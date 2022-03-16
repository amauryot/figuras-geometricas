package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Audio;
import model.Circle;
import model.Rectangle;
import model.Rhombus;
import model.Square;
import model.Trapezoid;
import model.Triangle;
import view.OptionPane;
import view.Window;
import view.frame.MenuItem;
import view.panel.Panel;
import view.panel.figure.circle.TextFieldCircle;
import view.panel.figure.rectangle.TextFieldRectangle;
import view.panel.figure.rhombus.TextFieldRhombus;
import view.panel.figure.square.TextFieldSquare;
import view.panel.figure.trapezoid.TextFieldTrapezoid;
import view.panel.figure.triangle.TextFieldTriangle;
import view.panel.menu.main.ButtonMain;
import view.panel.menu.quadrilaterals.ButtonQuadrilaterals;
import view.subpanel.buttons.Button;

public class Controller implements ActionListener {

	private Audio errorSound;
	private OptionPane optionPane;
	private Window window;
	
	public Controller() {
		errorSound = new Audio();
		optionPane = new OptionPane();
		window = new Window();
	}
	
	public void run() {
		window.show();
		window.addController(this);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		
		// ============================= MENU ITEM =============================
		
		if (event.getSource() == window.getMenuItem(MenuItem.ABOUT)) {
			optionPane.showMessageAbout();
			return;
		}
		
		if (event.getSource() == window.getMenuItem(MenuItem.EXIT)) {
			window.close();
		}
		
		// =============================== MAIN ================================
		
		if (event.getSource() == window.getMenuMain().getButton(ButtonMain.CIRCLE)) {
			window.setPanel(Panel.CIRCLE);
			return;
		}
		
		if (event.getSource() == window.getMenuMain().getButton(ButtonMain.TRIANGLE)) {
			window.setPanel(Panel.TRIANGLE);
			return;
		}
		
		if (event.getSource() == window.getMenuMain().getButton(ButtonMain.QUADRILATERALS)) {
			window.setPanel(Panel.MENU_QUADRILATERALS);
			return;
		}
		
		if (event.getSource() == window.getMenuMain().getButton(ButtonMain.EXIT)) {
			window.close();
		}
		
		// =========================== QUADRILATERALS ==========================
		
		if (event.getSource() == window.getMenuQuadrilaterals().getButton(ButtonQuadrilaterals.RHOMBUS)) {
			window.setPanel(Panel.RHOMBUS);
			return;
		}
		
		if (event.getSource() == window.getMenuQuadrilaterals().getButton(ButtonQuadrilaterals.SQUARE)) {
			window.setPanel(Panel.SQUARE);
			return;
		}
		
		if (event.getSource() == window.getMenuQuadrilaterals().getButton(ButtonQuadrilaterals.RECTANGLE)) {
			window.setPanel(Panel.RECTANGLE);
			return;
		}
		
		if (event.getSource() == window.getMenuQuadrilaterals().getButton(ButtonQuadrilaterals.TRAPEZOID)) {
			window.setPanel(Panel.TRAPEZOID);
			return;
		}
		
		if (event.getSource() == window.getMenuQuadrilaterals().getButton(ButtonQuadrilaterals.RETURN)) {
			window.setPanel(Panel.MENU_MAIN);
			return;
		}
		
		// ============================== CIRCLE ===============================
		
		if (event.getSource() == window.getMenuCircle().getButton(Button.CALCULATE)) {
			try {
				double radius = Double.parseDouble(window.getMenuCircle().getValueOf(TextFieldCircle.RADIUS));
				
				Circle circle = new Circle(radius);
				
				String perimeter = String.format("%.4f", circle.getPerimeter());
				String area = String.format("%.4f", circle.getArea());
				
				window.getMenuCircle().setResults(perimeter, area);
				
			} catch (NumberFormatException exception) {
				errorSound.play();
				optionPane.showMessageNumberFormatException();
			}
			return;
		}
		
		if (event.getSource() == window.getMenuCircle().getButton(Button.CLEAR)) {
			window.getMenuCircle().clear();
			return;
		}
		
		if (event.getSource() == window.getMenuCircle().getButton(Button.RETURN)) {
			window.setPanel(Panel.MENU_MAIN);
			return;
		}
		
		// ============================= TRIANGLE ==============================
		
		if (event.getSource() == window.getMenuTriangle().getButton(Button.CALCULATE)) {
			try {
				double base = Double.parseDouble(window.getMenuTriangle().getValueOf(TextFieldTriangle.BASE));
				double side1 = Double.parseDouble(window.getMenuTriangle().getValueOf(TextFieldTriangle.SIDE1));
				double side2 = Double.parseDouble(window.getMenuTriangle().getValueOf(TextFieldTriangle.SIDE2));
				double height = Double.parseDouble(window.getMenuTriangle().getValueOf(TextFieldTriangle.HEIGHT));
				
				Triangle triangle = new Triangle(base, side1, side2, height);
				
				String perimeter = String.format("%.4f", triangle.getPerimeter());
				String area = String.format("%.4f", triangle.getArea());
				
				window.getMenuTriangle().setResults(perimeter, area);
				
			} catch (NumberFormatException exception) {
				errorSound.play();
				optionPane.showMessageNumberFormatException();
			}
			return;
		}
		
		if (event.getSource() == window.getMenuTriangle().getButton(Button.CLEAR)) {
			window.getMenuTriangle().clear();
			return;
		}
		
		if (event.getSource() == window.getMenuTriangle().getButton(Button.RETURN)) {
			window.setPanel(Panel.MENU_MAIN);
			return;
		}
		
		// ============================== RHOMBUS ==============================
		
		if (event.getSource() == window.getMenuRhombus().getButton(Button.CALCULATE)) {
			try {
				double majorDiagonal = Double.parseDouble(window.getMenuRhombus().getValueOf(TextFieldRhombus.MAJOR_DIAGONAL));
				double minorDiagonal = Double.parseDouble(window.getMenuRhombus().getValueOf(TextFieldRhombus.MINOR_DIAGONAL));
				double side = Double.parseDouble(window.getMenuRhombus().getValueOf(TextFieldRhombus.SIDE));
				
				Rhombus rhombus = new Rhombus(majorDiagonal, minorDiagonal, side);
				
				String perimeter = String.format("%.4f", rhombus.getPerimeter());
				String area = String.format("%.4f", rhombus.getArea());
				
				window.getMenuRhombus().setResults(perimeter, area);
				
			} catch (NumberFormatException exception) {
				errorSound.play();
				optionPane.showMessageNumberFormatException();
			}
			return;
		}
		
		if (event.getSource() == window.getMenuRhombus().getButton(Button.CLEAR)) {
			window.getMenuRhombus().clear();
			return;
		}
		
		if (event.getSource() == window.getMenuRhombus().getButton(Button.RETURN)) {
			window.setPanel(Panel.MENU_QUADRILATERALS);
			return;
		}
		
		// ============================== SQUARE ===============================
		
		
		if (event.getSource() == window.getMenuSquare().getButton(Button.CALCULATE)) {
			try {
				double side = Double.parseDouble(window.getMenuSquare().getValueOf(TextFieldSquare.SIDE));
				
				Square square = new Square(side);
				
				String perimeter = String.format("%.4f", square.getPerimeter());
				String area = String.format("%.4f", square.getArea());
				
				window.getMenuSquare().setResults(perimeter, area);
				
			} catch (NumberFormatException exception) {
				errorSound.play();
				optionPane.showMessageNumberFormatException();
			}
			return;
		}
		
		if (event.getSource() == window.getMenuSquare().getButton(Button.CLEAR)) {
			window.getMenuSquare().clear();
			return;
		}
		
		if (event.getSource() == window.getMenuSquare().getButton(Button.RETURN)) {
			window.setPanel(Panel.MENU_QUADRILATERALS);
			return;
		}
		
		// ============================= RECTANGLE =============================
		
		if (event.getSource() == window.getMenuRectangle().getButton(Button.CALCULATE)) {
			try {
				double base = Double.parseDouble(window.getMenuRectangle().getValueOf(TextFieldRectangle.BASE));
				double height = Double.parseDouble(window.getMenuRectangle().getValueOf(TextFieldRectangle.HEIGHT));
				
				Rectangle rectangle = new Rectangle(base, height);
				
				String perimeter = String.format("%.4f", rectangle.getPerimeter());
				String area = String.format("%.4f", rectangle.getArea());
				
				window.getMenuRectangle().setResults(perimeter, area);
				
			} catch (NumberFormatException exception) {
				errorSound.play();
				optionPane.showMessageNumberFormatException();
			}
			return;
		}
		
		if (event.getSource() == window.getMenuRectangle().getButton(Button.CLEAR)) {
			window.getMenuRectangle().clear();
			return;
		}
		
		if (event.getSource() == window.getMenuRectangle().getButton(Button.RETURN)) {
			window.setPanel(Panel.MENU_QUADRILATERALS);
			return;
		}
		
		// ============================= TRAPEZOID =============================
		
		if (event.getSource() == window.getMenuTrapezoid().getButton(Button.CALCULATE)) {
			try {
				double side1 = Double.parseDouble(window.getMenuTrapezoid().getValueOf(TextFieldTrapezoid.SIDE1));
				double side2 = Double.parseDouble(window.getMenuTrapezoid().getValueOf(TextFieldTrapezoid.SIDE2));
				double majorBase = Double.parseDouble(window.getMenuTrapezoid().getValueOf(TextFieldTrapezoid.MAJOR_BASE));
				double minorBase = Double.parseDouble(window.getMenuTrapezoid().getValueOf(TextFieldTrapezoid.MINOR_BASE));
				double height = Double.parseDouble(window.getMenuTrapezoid().getValueOf(TextFieldTrapezoid.HEIGHT));
				
				Trapezoid trapezoid = new Trapezoid(side1, side2, majorBase, minorBase, height);
				
				String perimeter = String.format("%.4f", trapezoid.getPerimeter());
				String area = String.format("%.4f", trapezoid.getArea());
				
				window.getMenuTrapezoid().setResults(perimeter, area);
				
			} catch (NumberFormatException exception) {
				errorSound.play();
				optionPane.showMessageNumberFormatException();
			}
			return;
		}
		
		if (event.getSource() == window.getMenuTrapezoid().getButton(Button.CLEAR)) {
			window.getMenuTrapezoid().clear();
			return;
		}
		
		if (event.getSource() == window.getMenuTrapezoid().getButton(Button.RETURN)) {
			window.setPanel(Panel.MENU_QUADRILATERALS);
			return;
		}
	}
}
