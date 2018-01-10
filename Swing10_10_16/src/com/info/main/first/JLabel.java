package com.info.main.first;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.*;

public class JLabel 
{
	public static void main(String[] args)
	{
		JFrame frame =new JFrame();               frame.setVisible(true);
		frame.setBounds(300,300,300,300);
		frame.setTitle("JLabeluse");
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon icon=new ImageIcon("Img2.gif]");
		frame.setIconImage(icon.getImage());
		Container c=frame.getContentPane();
		c.setBackground(Color.magenta);
		
		JButton b=new JButton();
		b.setBounds(100,100,100,60);
			b.setBackground(Color.CYAN);
		
		
		
		frame .add(b);
		
		
		
		
		     
	}
}
