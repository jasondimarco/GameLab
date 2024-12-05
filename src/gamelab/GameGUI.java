package gamelab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GameGUI extends JFrame implements ActionListener {

	public static void main(String[] args) {
		new GameGUI();
	}
	
	public JTextArea texta;
	private JPanel panel;
	private JLabel label;
	private JTextField textf;
	private JButton button;
	private JFrame frame;
	
	public GameGUI() {
		buildWindow();
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		JButton b = (JButton) event.getSource();
	}

	private void buildWindow() {
		setTitle("Cave Adventure");
		
		texta = new JTextArea();
		panel = new JPanel(new GridLayout(3,1));
		label = new JLabel("What would you like to do?");
		textf = new JTextField();
		button = new JButton("Execute");
		frame = new JFrame();
		
		button.addActionListener(this); // Register this class as action Listener
		button.setFont(new Font(null, Font.BOLD, 24));
		
		panel.add(label);
		panel.add(textf);
		panel.add(button);
		
		frame.add(texta);
		frame.add(panel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500); // Sets window's size
		setLocationRelativeTo(null); // Centers window
		setVisible(true); // Make window visible
	}
}
