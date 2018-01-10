package com.info.inherit;

class Base
{
	int a=4243;
	Base()
	{
		System.out.println(" Base class constructor is called !!!");
	}
}

class Derived extends Base
{
	
	int a=200;
	Derived()
	{
		super();   //implicitly used by jvm 
		//super.Base();  it is an error because this is syntax of method calling not constructor calling
		System.out.println("Derived class cons!!!");
	}
	
	public void show()
	{
		System.out.println("A:  "+a);
	//	System.out.println(" B:  "+b);
	}
}

public class Constructior 
{
	public static void main(String[] args)
	{
		Derived obj=new Derived();
		obj.show();
	}
	
}
