package com.info.main;

 class Main<T>
{
	T obj;
	public Main(T obj)
	{
			this.obj=obj;
	}
	
	public void show()
	{
		System.out.println("the type of obj:  "+obj.getClass().getName());
	}
	
	public T getObject()
	{
		return obj;
	}
}

public class Generics_Classes
{
	static public void main(String abc[])
	{
		Main<String> g1=new Main<String>("koushi");
		g1.show();
		System.out.println(g1.getObject());
	
		Main<Integer> g2=new Main<Integer>(59);
	  g2.show();
	   Integer obj=g2.getObject();
	   System.out.println(obj);
	  
	}
	
	
}
