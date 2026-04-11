package javaswing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestForm {

	public static void main(String[] args) {
		
		JFrame form = new JFrame();
		
		form.setSize(800,500);
		form.setTitle("My form");
		
		form.setVisible(true);
		form.setLayout(null);
		
		
		//create form
		
		JButton jb = new JButton("click");
		jb.setBounds(150,50,150,50);
		form.add(jb);
		
		form.setVisible(true);
		
		
	}
}
