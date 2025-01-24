package java_frontend;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Joptionpane {

	public static void main(String[] args) {
		JFrame frame=new JFrame("main");
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
		JOptionPane.showMessageDialog(frame,"HELLO","Alert",JOptionPane.WARNING_MESSAGE);

	}

}
