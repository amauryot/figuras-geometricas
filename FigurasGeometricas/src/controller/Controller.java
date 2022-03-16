package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.OptionPane;
import view.Window;
import view.frame.MenuItem;
import view.panel.Panel;
import view.panel.menu.main.ButtonMain;
import view.panel.menu.quadrilaterals.ButtonQuadrilaterals;
import view.subpanel.buttons.Button;

public class Controller implements ActionListener {

	private OptionPane optionPane;
	private Window window;
	
	public Controller() {
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
			// TODO
			return;
		}
		
		if (event.getSource() == window.getMenuCircle().getButton(Button.CLEAR)) {
			// TODO
			return;
		}
		
		if (event.getSource() == window.getMenuCircle().getButton(Button.RETURN)) {
			window.setPanel(Panel.MENU_MAIN);
			return;
		}
		
		// ============================= TRIANGLE ==============================
		
		if (event.getSource() == window.getMenuTriangle().getButton(Button.CALCULATE)) {
			// TODO
			return;
		}
		
		if (event.getSource() == window.getMenuTriangle().getButton(Button.CLEAR)) {
			// TODO
			return;
		}
		
		if (event.getSource() == window.getMenuTriangle().getButton(Button.RETURN)) {
			window.setPanel(Panel.MENU_MAIN);
			return;
		}
		
		// ============================== RHOMBUS ==============================
		
		if (event.getSource() == window.getMenuRhombus().getButton(Button.CALCULATE)) {
			// TODO
			return;
		}
		
		if (event.getSource() == window.getMenuRhombus().getButton(Button.CLEAR)) {
			// TODO
			return;
		}
		
		if (event.getSource() == window.getMenuRhombus().getButton(Button.RETURN)) {
			window.setPanel(Panel.MENU_QUADRILATERALS);
			return;
		}
		
		// ============================== SQUARE ===============================
		
		
		if (event.getSource() == window.getMenuSquare().getButton(Button.CALCULATE)) {
			// TODO
			return;
		}
		
		if (event.getSource() == window.getMenuSquare().getButton(Button.CLEAR)) {
			// TODO
			return;
		}
		
		if (event.getSource() == window.getMenuSquare().getButton(Button.RETURN)) {
			window.setPanel(Panel.MENU_QUADRILATERALS);
			return;
		}
		
		// ============================= RECTANGLE =============================
		
		if (event.getSource() == window.getMenuRectangle().getButton(Button.CALCULATE)) {
			// TODO
			return;
		}
		
		if (event.getSource() == window.getMenuRectangle().getButton(Button.CLEAR)) {
			// TODO
			return;
		}
		
		if (event.getSource() == window.getMenuRectangle().getButton(Button.RETURN)) {
			window.setPanel(Panel.MENU_QUADRILATERALS);
			return;
		}
		
		// ============================= TRAPEZOID =============================
		
		if (event.getSource() == window.getMenuTrapezoid().getButton(Button.CALCULATE)) {
			// TODO
			return;
		}
		
		if (event.getSource() == window.getMenuTrapezoid().getButton(Button.CLEAR)) {
			// TODO
			return;
		}
		
		if (event.getSource() == window.getMenuTrapezoid().getButton(Button.RETURN)) {
			window.setPanel(Panel.MENU_QUADRILATERALS);
			return;
		}
	}
}
