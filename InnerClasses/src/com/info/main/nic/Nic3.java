package com.info.main.nic;

// case 3: Accessing Inner class from outside of outer class
public class Nic3 
{

	class Inner
	{
		public void m1()
		{
			System.out.println("inner class method");
		}
	}
}

class Test1
{
	public static void main()
	{
		new Nic3().new Inner().m1();
	}
}
