package com.info.main.nic;

//case 1: Accessing inner class from static area of outer class 
public class Nic1 
{

	class Inner
	{
		public void m1()
		{
			System.out.println("inner class method");
		}
	}
	
  
 public static void main(String[] args)
 {
	 //Nic1 outer=new Nic1();
//	 Nic1.Inner i= outer.new Inner();
	// i.m1();
	 
	 
	 // above three lines can be written as
	 new Nic1().new Inner().m1();
 }
}
