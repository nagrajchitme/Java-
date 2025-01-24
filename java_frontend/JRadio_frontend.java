package java_frontend;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JRadio_frontend {

	public static void main(String[] args) {
		JFrame frame=new JFrame("main");
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
		JRadioButton rbtn=new JRadioButton("HTML");
		rbtn.setBounds(50,60,80,30);
		JRadioButton rbtn1=new JRadioButton("CSS");
		rbtn1.setBounds(50,80,80,30);
		JRadioButton rbtn2=new JRadioButton("javaScript");
		rbtn2.setBounds(50,100,80,30);
		JRadioButton rbtn3=new JRadioButton("Node.js");
		rbtn3.setBounds(50,120,80,30);
		JRadioButton rbtn4=new JRadioButton("React.js");
		rbtn4.setBounds(50,140,80,30);
		
		frame.add(rbtn);
		frame.add(rbtn1);
		frame.add(rbtn2);
		frame.add(rbtn3);
		frame.add(rbtn4);
	
		String data[]= {"HTML","CSS","JavaScript"};
		JComboBox cmb=new JComboBox(data);
		cmb.setBounds(50,180,100,30);
		frame.add(cmb);

	}

}
