package java_frontend;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Jcheckbox_frontend {

	public static void main(String[] args) {
		JFrame frame=new JFrame("main");
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
		JCheckBox chbx=new JCheckBox("c++");
		chbx.setBounds(50,60,300,30);
		JCheckBox chbx1=new JCheckBox("java");
		chbx1.setBounds(50,80,300,30);
		JCheckBox chbx2=new JCheckBox("python");
		chbx2.setBounds(50,100,300,30);
		JCheckBox chbx3=new JCheckBox("DotNet");
		chbx3.setBounds(50,120,300,30);
		frame.add(chbx);
		frame.add(chbx1);
		frame.add(chbx2);
		frame.add(chbx3);

	}

}
