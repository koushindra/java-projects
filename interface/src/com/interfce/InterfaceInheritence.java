package com.interfce;

// A class implements interface but one Interface extents another Interface

interface Printable1
{
	void print();
}

interface Showable1 extends Printable1
{
	void show();
}

public class InterfaceInheritence implements Showable1
{

	@Override
	public void print() 
	{
		System.out.println("this is print method");
		
	}

	@Override
	public void show() 
	{
		
		System.out.println(" this is show method");
	}

	public static void main(String[] args)
	{
	//	Showable1 obj=new Showable1(); interface or abstract class can not be instantiate 
		
		InterfaceInheritence In=new InterfaceInheritence();
		In.print();
		In.show();
		
	}
}
