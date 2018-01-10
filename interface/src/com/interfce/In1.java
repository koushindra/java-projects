package com.interfce;
// multiple inheritence by interface
interface Printable
{
	void print();
}
interface Showable
{
	void show();
}

public class In1 implements Printable,Showable
{
	@Override
	public void print()
	{
		System.out.println("Hello in interface world");
		
	}
	
	public static void main(String[] args) 
	{
		In1 obj=new In1();
				obj.print();
				obj.show();
		System.out.println("this is an example of multiple inheritence by using interface");
	}

	@Override
	public void show() 
	{
		System.out.println("this is show method");
		
	}

}
