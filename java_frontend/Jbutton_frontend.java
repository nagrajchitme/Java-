package java_frontend;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Jbutton_frontend {

	public static void main(String[] args) {
		JFrame frame=new JFrame("main");
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
		
	JButton btn=new JButton("click me");
	btn.setBounds(120,100,100,50);
	frame.add(btn);
		

	}

}
