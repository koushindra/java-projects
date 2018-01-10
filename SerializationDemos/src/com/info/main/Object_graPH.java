package com.info.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

					class A implements Serializable
					{
						B1 d=new B1();
					}
					class B1 implements Serializable
					{
						C1 c =new C1();
					}
					class C1 implements Serializable
					{
						int value=50;
					}


public class Object_graPH 
{
	public static void main(String[] args) throws IOException,ClassNotFoundException,NoSuchFieldError
	{
		A a1=new A();
		
		FileOutputStream fos=new FileOutputStream("file.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(a1);
		oos.close();
		fos.close();
		
		FileInputStream fis=new FileInputStream("file.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		A a2=(A)ois.readObject();
		
		System.out.println("value of j: "+a2.d.c.value);
	}
	
	
}
