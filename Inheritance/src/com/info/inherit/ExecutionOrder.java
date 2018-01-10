package com.info.inherit;

class C
{
	int cvalue=1000;
   C()
   {
	  System.out.println("Parent class constructor "+this.hashCode());
   }
   {
	   System.out.println("Parent class instance block");
   }
   static
   {
	   System.out.println("Parent class static block");
   }
}
class D extends C
{
	int dvalue=2000;
	{
		System.out.println("Child class instance block");
	}
	static 
	{
		System.out.println("child class static block\n");
	}
	D()
	{
		System.out.println("child class constructor"  +this.hashCode());
	}
/*	D d1=new D();
	int x=d1.dvalue;*/
}

public class ExecutionOrder 
{
	public static void main(String args[])
	{
		//D d=new D();
	         C c1=new D();   // upcasting
	               //  c1.cvalue;   // Error becoz c1.value return a value but it is not stored anywhere
	 System.out.println(c1.cvalue);
	      //      int z=  c1.dvalue;
	     //  int z1=d.dvalue;
	         
	}
}
