package java_frontend;

import java.awt.*;

import javax.swing.JFrame;

public class Image {

	public static void main(String[] args) {
		JFrame frame=new JFrame("main");
		frame.setSize(400,400);
		frame.setVisible(true);
		java.awt.Image icon=Toolkit.getDefaultToolkit().getImage("Raj.jpg");

	}

}
