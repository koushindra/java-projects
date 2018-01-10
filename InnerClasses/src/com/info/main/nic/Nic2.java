package com.info.main.nic;

// case 2: Accessing inner class from instance area of outer class
public class Nic2
{
			
				class Inner
				{
					public void m1()
					{
						System.out.println("inner class method ");
					}
				}
				
	   public void m2()
	   {
		   Inner i=new Inner();
		   i.m1();
	   }
	   
	public static void main(String[] args)
	{
		Nic2 outer=new Nic2();
		outer.m2();
	}
}
