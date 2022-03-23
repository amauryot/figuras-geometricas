package view;

import java.util.ArrayList;

import javax.swing.JMenuItem;

import controller.Controller;
import view.frame.Frame;
import view.frame.MenuItem;
import view.panel.Panel;
import view.panel.PanelAbstract;
import view.panel.PanelMain;
import view.panel.figure.circle.PanelCircle;
import view.panel.figure.rectangle.PanelRectangle;
import view.panel.figure.rhombus.PanelRhombus;
import view.panel.figure.square.PanelSquare;
import view.panel.figure.trapezoid.PanelTrapezoid;
import view.panel.figure.triangle.PanelTriangle;
import view.panel.menu.main.PanelMenuMain;
import view.panel.menu.quadrilaterals.PanelMenuQuadrilaterals;

public class Window {

	private Frame frame;
	private PanelMain panelMain;
	private PanelMenuMain panelMenuMain;
	private PanelMenuQuadrilaterals panelMenuQuadrilaterals;
	private PanelCircle panelCircle;
	private PanelTriangle panelTriangle;
	private PanelRhombus panelRhombus;
	private PanelSquare panelSquare;
	private PanelRectangle panelRectangle;
	private PanelTrapezoid panelTrapezoid;
	
	private ArrayList<PanelAbstract> panelList;
	
	public Window() {
		initialize();
		setPanel(Panel.MENU_MAIN);
	}

	public JMenuItem getMenuItem(MenuItem menuItem) {
		return frame.menuItemList().get(menuItem.index());
	}
	
	public PanelMenuMain getMenuMain() {
		return panelMenuMain;
	}
	
	public PanelMenuQuadrilaterals getMenuQuadrilaterals() {
		return panelMenuQuadrilaterals;
	}
	
	public PanelCircle getMenuCircle() {
		return panelCircle;
	}
	
	public PanelTriangle getMenuTriangle() {
		return panelTriangle;
	}
	
	public PanelRhombus getMenuRhombus() {
		return panelRhombus;
	}
	
	public PanelSquare getMenuSquare() {
		return panelSquare;
	}
	
	public PanelRectangle getMenuRectangle() {
		return panelRectangle;
	}
	
	public PanelTrapezoid getMenuTrapezoid() {
		return panelTrapezoid;
	}
	
	public void setPanel(Panel panelEnum) {
		panelList.forEach(panel -> panel.setVisible(false));
		panelList.get(panelEnum.index()).setVisible(true);
	}
	
	public void addController(Controller controller) {
		frame.menuItemList().forEach(menuItem -> menuItem.addActionListener(controller));
		panelList.forEach(panel -> panel.addController(controller));
	}
	
	public void show() {
		frame.setVisible(true);
	}
	
	public void close() {
		frame.dispose();
	}
	
	private void initialize() {
		frame = new Frame();
		
		panelMain = new PanelMain();
		frame.getContentPane().add(panelMain);
		
		panelList = new ArrayList<PanelAbstract>();
		
		panelMenuMain = new PanelMenuMain();
		panelMain.add(panelMenuMain);
		panelList.add(panelMenuMain);
		
		panelMenuQuadrilaterals = new PanelMenuQuadrilaterals();
		panelMain.add(panelMenuQuadrilaterals);
		panelList.add(panelMenuQuadrilaterals);
		
		panelCircle = new PanelCircle();
		panelMain.add(panelCircle);
		panelList.add(panelCircle);
		
		panelTriangle = new PanelTriangle();
		panelMain.add(panelTriangle);
		panelList.add(panelTriangle);
		
		panelRhombus = new PanelRhombus();
		panelMain.add(panelRhombus);
		panelList.add(panelRhombus);
		
		panelSquare = new PanelSquare();
		panelMain.add(panelSquare);
		panelList.add(panelSquare);
		
		panelRectangle = new PanelRectangle();
		panelMain.add(panelRectangle);
		panelList.add(panelRectangle);
		
		panelTrapezoid = new PanelTrapezoid();
		panelMain.add(panelTrapezoid);
		panelList.add(panelTrapezoid);
	}
}
