package java_frontend;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jlabel_frontend {

	public static void main(String[] args) {
		JFrame frame=new JFrame("main");
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
	JLabel leb=new JLabel("This is heading");
	leb.setBounds(130,60,100,50);
	frame.add(leb);
	
		

	}

}
