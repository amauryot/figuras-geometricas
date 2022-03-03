package view;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Window {

	private JFrame frame;

	public Window() {
		initialize();
	}

	public void show() {
		frame.setVisible(true);
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Figuras Geométricas");
		frame.setBounds(100, 100, 404, 595);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("Menu");
		menuBar.add(menu);
		
		JMenuItem menuItemAbout = new JMenuItem("Sobre");
		menu.add(menuItemAbout);
		
		JMenuItem menuItemExit = new JMenuItem("Sair");
		menu.add(menuItemExit);
		frame.getContentPane().setLayout(null);
		
		JPanel panelMain = new JPanel();
		panelMain.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelMain.setBounds(10, 10, 370, 515);
		frame.getContentPane().add(panelMain);
		panelMain.setLayout(null);
		
		JPanel panelImage = new JPanel();
		panelImage.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelImage.setBounds(10, 10, 350, 220);
		panelMain.add(panelImage);
		panelImage.setLayout(null);
		
		JLabel labelImage = new JLabel("");
		labelImage.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		labelImage.setHorizontalAlignment(SwingConstants.CENTER);
		labelImage.setBounds(20, 5, 310, 210);
		panelImage.add(labelImage);
		
		JPanel panelData = new JPanel();
		panelData.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelData.setBounds(10, 240, 350, 115);
		panelMain.add(panelData);
		panelData.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Base Maior:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 10, 90, 25);
		panelData.add(lblNewLabel);
		
		JTextField textField = new JTextField();
		textField.setBounds(110, 10, 60, 25);
		panelData.add(textField);
		textField.setColumns(10);
		
		JLabel lblBaseMenor = new JLabel("Base Menor:");
		lblBaseMenor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBaseMenor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBaseMenor.setBounds(10, 45, 90, 25);
		panelData.add(lblBaseMenor);
		
		JTextField textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(110, 45, 60, 25);
		panelData.add(textField_1);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAltura.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAltura.setBounds(10, 80, 90, 25);
		panelData.add(lblAltura);
		
		JTextField textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(110, 80, 60, 25);
		panelData.add(textField_2);
		
		JLabel lblLado = new JLabel("Lado 1:");
		lblLado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLado.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLado.setBounds(180, 10, 90, 25);
		panelData.add(lblLado);
		
		JTextField textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(280, 10, 60, 25);
		panelData.add(textField_3);
		
		JLabel lblLado_1 = new JLabel("Lado 2:");
		lblLado_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLado_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLado_1.setBounds(180, 45, 90, 25);
		panelData.add(lblLado_1);
		
		JTextField textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(280, 45, 60, 25);
		panelData.add(textField_4);
		
		JPanel panelResult = new JPanel();
		panelResult.setLayout(null);
		panelResult.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelResult.setBounds(10, 365, 350, 80);
		panelMain.add(panelResult);
		
		JLabel lblPermetro = new JLabel("Per\u00EDmetro:");
		lblPermetro.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPermetro.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPermetro.setBounds(95, 10, 80, 25);
		panelResult.add(lblPermetro);
		
		JTextField textField_5 = new JTextField();
		textField_5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(185, 10, 70, 25);
		panelResult.add(textField_5);
		
		JLabel lblAltura_1 = new JLabel("\u00C1rea:");
		lblAltura_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAltura_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAltura_1.setBounds(95, 45, 80, 25);
		panelResult.add(lblAltura_1);
		
		JTextField textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		textField_6.setColumns(10);
		textField_6.setBounds(185, 45, 70, 25);
		panelResult.add(textField_6);
		
		JPanel panelButtons = new JPanel();
		panelButtons.setBounds(30, 465, 310, 30);
		panelMain.add(panelButtons);
		panelButtons.setLayout(null);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setFocusable(false);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(0, 0, 90, 30);
		panelButtons.add(btnNewButton);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFocusable(false);
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLimpar.setBounds(110, 0, 90, 30);
		panelButtons.add(btnLimpar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFocusable(false);
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVoltar.setBounds(220, 0, 90, 30);
		panelButtons.add(btnVoltar);
	}
}
