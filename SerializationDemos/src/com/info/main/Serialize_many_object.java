package com.info.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.ietf.jgss.Oid;


class B implements Serializable 
{
	int j=50;
}
class C implements Serializable
{
	int k=70;
}
class A implements Serializable
{
	int i=40;
}

public class Serialize_many_object 
{
	public static void main(String[] args)throws Exception
	{
	
    B b1=new B();
	 C c1=new C();
	 A a1=new A();
	 
	FileOutputStream fos=new FileOutputStream("Myfile.ser");
	ObjectOutputStream oos=new ObjectOutputStream(fos);

	oos.writeObject(b1);
	oos.writeObject(a1);
	oos.writeObject(c1);      // SEQUENCE IS A,B,C
									  oos.close();
									  fos.close();
	
	//DeSerialization
									  
	FileInputStream fis =new FileInputStream("Myfile.ser");
	ObjectInputStream ois=new ObjectInputStream(fis);
/*	A a2=(A)ois.readObject();
    B b2=(B)ois.readObject();
    C c2 =(C)ois.readObject();*/
	////--------OR IF WE DON'T KNOW THE ORDER OF OBJECTS IN SERIALIZATION THEN DESERIALIZE AS :--------
	Object o=ois.readObject();
	if(o instanceof B)
	{
		B b2=(B)o;
		System.out.println("value of j  :"+b2.j);
	}
	if(o instanceof A)
	{
		A a2=(A)o;    //  Downcasting  Parent class object reference is stored in child class reference variable
								////A a3=(A)(new Object());  reference of Object class object is stored in A class reference variable
	System.out.println("value of i: "+a2.i);
	}   
 
	else
	   {
		C c2=(C)o;
	     System.out.println("value of k  :"+c2.k);
		}

	}
}
