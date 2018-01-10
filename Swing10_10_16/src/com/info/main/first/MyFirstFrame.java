package com.info.main.first;


import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFirstFrame 
{
	public static void main(String[] args)
	{
		JFrame frame=new JFrame();
		frame.setVisible(true);
		//frame.setSize(200,350);   // width and height
	//	frame.setLocation(100, 300); // margin-left and margin-bottom
		
		frame.setBounds(3,300,500,400);
		frame.setTitle("first Swing Frame");

		
		// SET IMAGE ICON
		 // put a image in folder of project
		// make object of ImageIcon
		
		ImageIcon icon=new ImageIcon("newl.jpg");
		frame.setIconImage(icon.getImage());
		
		// SET BACKGROUND 
		  Container c=frame.getContentPane();
		  c.setBackground(Color.BLUE);
		  
		  // SET RESIZABLE
		  frame.setResizable(false);
		  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
