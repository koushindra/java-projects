package com.info.main;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class FirstDemo extends Applet{
	
	Image pic;
	public void init()
	{
		pic=getImage(getDocumentBase(),"newl.jpg");
	}

	public void paint(Graphics g){  
		g.setFont(getFont());
		g.drawString("welcome",200,150);  
		
		g.drawRect(0, 50, 400, 800); // margin-left,margin-right,width,height	
		g.drawLine(10, 50, 300, 200);  //(x1,y1) and (x2,y2)
		g.draw3DRect(100, 200, 300, 400, isFocusTraversalPolicySet());
		
		g.setColor(Color.blue);
		g.fill3DRect(200, 330, 400, 300, getFocusTraversalKeysEnabled());
		g.fillRoundRect(400, 300, 200, 200, getWidth(), HEIGHT);
		
		g.drawImage(pic, 200, 100,this );
		

	}
}
