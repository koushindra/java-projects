package com.info.main.first;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout.Group;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtons 
{
	public static void main(String[] args)
	{
		JFrame jf=new JFrame();
		jf.setVisible(true);
		jf.setBounds(200,200,400,300);
		jf.setLayout(null);
		
		JRadioButton a=new JRadioButton("a) yes");
		JRadioButton b=new JRadioButton("b) No");
		
		a.setBounds(200,100,100,50);            //     a.setBackground(Color.blue);
		b.setBounds(200,150,100,50);				// b.setBackground(Color.blue);
		
	   ButtonGroup bg=new ButtonGroup();   // adding button to the group
	   bg.add(a);
	   bg.add(b);
	   
	   
	   jf.add(a); // adding button to the frame
	   jf.add(b);
	   
	   jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
