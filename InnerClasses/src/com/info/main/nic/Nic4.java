package com.info.main.nic;

public class Nic4 
{
	int x=10;   // it is x of outer.this (current outer) class object
	static int y=40;
	
			class Inner
			{
			//	static int z=50;   it is an error because static method cannot be declared inside normal inner class
			// because static members allocate memory before object creation but inner class execute after object creation
				
				final int z=50;
				
				int x=100;  // it is x of current class object
				public void m1()
				{
					int x=1000;   // it is x
					System.out.println("X: "+x);
					System.out.println("X: "+this.x);
					System.out.println("X: "+Nic4.this.x);
					
					
					System.out.println("Y:  "+y);
					System.out.println("Z:  "+z);
				}
			}
	
	public static void main(String[] args)
	{
		new Nic4().new  Inner().m1();
	}
}
