package com.interfce;

class A
{
	public interface NestedIF
	{
		boolean isNotNegative(int x); 
	}
}
class d implements A.NestedIF
{
	public  boolean isNotNegative(int x)
	{
		return x<0? false:true;
	}
}
public class nestedifdemo
{
		public static void main(String[] args)
		{
			A.NestedIF nif = new d();
			
			if(nif.isNotNegative(10))
			{
				System.out.println("10 is not negative");
			}
			if(nif.isNotNegative(-13))
				System.out.println("this won't be displaye");
		}
}
