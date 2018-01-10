package com.info.main.first;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ImageButton 
{
	public static void main(String[] args)
	{
		JFrame frame =new JFrame();
		JButton b=new JButton();
		ImageIcon icon=new ImageIcon("img2.gif");
	    b.setIcon(icon);
	    b.setBounds(100,50,150,89);
	    
	    frame.add(b);
	    frame.setSize(400,300);
	    frame.setVisible(true);
	    
	    frame.setLayout(null);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
