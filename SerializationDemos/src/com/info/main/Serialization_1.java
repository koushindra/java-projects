package com.info.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;           // Serialiazable interface lies in java.io package AND IT IS MARKER INTERFACE

class Baloon implements Serializable
{//  IF WE DON'T IMPLEMENTS SERIALIZABLE -THEN EXECPION IS---java.io.NotSerializableException: com.info.main.Baloon
	int i=10;
	int j=20;
// AN OBJECT CAN BE MADE SERIABLIZABEL IF AND ONLY IF CORROSPONDING CLASS IS IMPLEMENTS SERIALIZABLE INTERFACE
}

public class Serialization_1 
{
	public static void main(String[] args) throws Exception
	{
		Baloon b1=new Baloon();
		
		//  Serializing the object 
		FileOutputStream fos=new FileOutputStream("Myfile.ser");
		ObjectOutputStream  oos=new ObjectOutputStream(fos);
		oos.writeObject(b1);
		
		
		//DeSerializing the object 
		  FileInputStream fis=new FileInputStream("Myfile.ser");
		  ObjectInputStream ois=new ObjectInputStream(fis);
		  Baloon b2=(Baloon)ois.readObject();
	
		  System.out.println("values after Deserialization are: " +"value of i: "+b2.i+"   value of j: "+b2.j);
	}
}
