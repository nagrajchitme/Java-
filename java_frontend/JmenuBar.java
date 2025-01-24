package java_frontend;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JmenuBar {

	public static void main(String[] args) {
		JFrame frame=new JFrame("main");
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
		JMenuBar mb=new JMenuBar();
		JMenu menu,submenu;
		JMenuItem I1,I2,I3,I4,I5;
		menu=new JMenu("menu");
		submenu=new JMenu("submenu");
		I1=new JMenuItem("Item1");
		I2=new JMenuItem("Item2");
		I3=new JMenuItem("Item3");
		I4=new JMenuItem("Item4");
		I5=new JMenuItem("Item5");
		menu.add(I1);
		menu.add(I2);
		menu.add(I3);
		submenu.add(I4);
		submenu.add(I5);
		menu.add(submenu);
		mb.add(menu);
		frame.setJMenuBar(mb);
		
	}

}
