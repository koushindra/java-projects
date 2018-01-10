package com.koushi.main;
class Test
{
	
}
public class GetObjects 
{
				void showName(Object obj)
				{
					Class c=obj.getClass();
					System.out.println("showName()  :"+c);
				}
	
	public static void main(String[] args) throws ClassNotFoundException
	{
		Class reference=Class.forName("com.koushi.main.Test");  // Used fully qualified path of class otherwise throws ClassNotFoundException
		System.out.println(reference.getName());
		
		Test t=new Test();
		GetObjects g=new GetObjects();
		g.showName(t);
	}
}
