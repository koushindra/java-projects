package com.info.main.first;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class JTextArea1  extends JFrame 
{
	JTextArea jta;
	
	public JTextArea1() 
	{
		jta=new JTextArea(300,400);
		jta.setBounds(200,200,300,400);
		jta.setForeground(Color.lightGray);
		jta.setBackground(Color.yellow);
		
		add(jta);
		setBounds(200,200,1200,1000); setLayout(null);  setVisible(true);
	
		
	
	}
	

   public static void main(String[] args)
   {
	   new JTextArea1();
   }
}
