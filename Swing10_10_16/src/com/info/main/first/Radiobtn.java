package com.info.main.first;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Radiobtn extends JFrame implements ActionListener
{
	JRadioButton rb1,rb2;
	JButton b;
	
	
	public Radiobtn()
	{
		
		rb1=new JRadioButton("Yes");
		rb2=new JRadioButton("No");
		b=new JButton("click here");
		
		rb1.setBounds(200,200,100,50);
		rb2.setBounds(200,250,100,50);
		b.setBounds(225,300,150,75);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		b.addActionListener(this);
		
		add(rb1); add(rb2); add(b);      // adding in JFrame 
		setBounds(200,200,600,400);		// JFrame object is not used here because JFrame is implemented here
		setLayout(null);
		setVisible(true);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(rb1.isSelected())
		{
			JOptionPane.showMessageDialog(this,"yes is selected");
			
		}
		if(rb2.isSelected())
		{
			JOptionPane.showMessageDialog(this,"no is selected");
		}
	}

	public static void main(String[] args)
	{
		new Radiobtn();
	}
}
