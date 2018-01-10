package com.info.main.mlic;

public class Outer1 
{
	public void m1()
	{
		class Inner
		{
			public void sum(int x, int y)
			{
				System.out.println("the sum is "+(x+y));
			}
		}
		
		Inner i=new Inner();
		i.sum(40, 50);
		i.sum(34, 453);
		i.sum(234, 243);
		;;;;;;;;;
	}
	
	public static void main(String[] args)
	{
		Outer1 o=new Outer1();
		o.m1();
	}
}
