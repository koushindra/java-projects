package com.info.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Balloon implements Serializable
{
	int a=10;    
	transient int b=20;      // A transient variable should not be final or static otherwise original value will be used 
	
	transient static int c=30;
	static transient int d=40;
//	TRANSIENT IS A MODIFIER FOR ONLY FOR VARIABLE USED FOR SECURITY PURPOSE SO THAT JVM CAN IGNORE ORIGINAL VALUE OF 
	
	// TRANSIENT VARIABLE AND SAVE DEFAULT VALUE TO THE FILE
	
	transient final int f=60;
	final transient int g=70;
	
	transient final static int h=80;
	final static transient int i=90;
	transient static final int j=100;
	static transient final int k=110;
	
}
public class Transient_static 
{
	public static void main(String[] args) throws Exception
	{
		//Serialization
	Balloon b1=new Balloon();
	FileOutputStream fos=new FileOutputStream("Myfile.ser");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(b1);
	
	//DeSerialization
	FileInputStream fis =new FileInputStream("Myfile.ser");
	ObjectInputStream ois =new ObjectInputStream(fis);
	Balloon b2 =(Balloon) ois.readObject();
	
	System.out.println(" int a=10;  "+b2.a);
	System.out.println(" transient int b=20;  "+b2.b);
	System.out.println("   ");
	System.out.println(" transient static int c=30;  "+b2.c);
	System.out.println(" static transient int d=40;  "+b2.d);
	System.out.println("   ");
	System.out.println(" transient final int f=60;  "+b2.f);
	System.out.println("  final transient int g=70; "+b2.g);
	System.out.println("   ");
	System.out.println("transient final static int h=80;   "+b2.h);
	System.out.println("  final static transient int i=90; "+b2.i);
	System.out.println(" transient static final int j=100;  "+b2.j);
	System.out.println("   static transient final int k=110;   "+b2.k);
	
	
	}
}
