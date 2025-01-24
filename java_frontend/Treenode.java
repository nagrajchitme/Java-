package java_frontend;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class Treenode {

	public static void main(String[] args) {
		JFrame frame=new JFrame("main");
		frame.setSize(400,400);
		frame.setVisible(true);
		DefaultMutableTreeNode style=new DefaultMutableTreeNode("style");
		DefaultMutableTreeNode color=new DefaultMutableTreeNode("color");
		DefaultMutableTreeNode font=new DefaultMutableTreeNode("font");
		
		style.add(color);
		style.add(font);
		
		DefaultMutableTreeNode red=new DefaultMutableTreeNode("Red");
		DefaultMutableTreeNode green=new DefaultMutableTreeNode("Green");
		DefaultMutableTreeNode blue=new DefaultMutableTreeNode("Blue");
		DefaultMutableTreeNode orange=new DefaultMutableTreeNode("Orange");
		DefaultMutableTreeNode yellow=new DefaultMutableTreeNode("Yellow");
		
		color.add(red);
		color.add(green);
		color.add(blue);
		color.add(orange);
		color.add(yellow);
		
		DefaultMutableTreeNode TimesofRoman=new DefaultMutableTreeNode("TimesofRoman");
		DefaultMutableTreeNode Robotic=new DefaultMutableTreeNode("Robotic");
		
		font.add(TimesofRoman);
		font.add(Robotic);
		
		JTree jt=new JTree(style);
		
		frame.add(jt);
		
		System.out.println(frame);
		

	}

}
