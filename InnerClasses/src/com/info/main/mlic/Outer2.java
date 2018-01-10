package com.info.main.mlic;

public class Outer2
{
	int x=10;
	static int y=20;
	
		public void m1()
		{
			int z=30;
			
			class mlic
			{
				public  void m2()
				{
					System.out.println("z:  "+z);
					System.out.println("x:   "+x);
					System.out.println("y:   "+y);
				}
			}
			
			mlic obj=new mlic();
			obj.m2();
		}
	public static  void main(String[] args)
	{
		Outer2 obj=new Outer2();
		obj.m1();
	}
}
