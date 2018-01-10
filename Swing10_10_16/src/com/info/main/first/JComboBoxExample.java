package com.info.main.first;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBoxExample extends JFrame
{
	public JComboBoxExample() 
	{
		String students[]={"a","b","c"};
		JComboBox jcb=new JComboBox<>(students);
		jcb.setBounds(200,200,100,30);
		
		add(jcb);  setSize(1000,800);  setLayout(null);  setVisible(true);
		
		
	}
	public static void main(String[] args)
	{
		new JComboBoxExample();
	}
	
}
