package com.info.main;

 class Gen<T>
{
	T obj;
	Gen (T obj)
	{
		this.obj=obj;
	}
	public void show()
	{
		System.out.println("The type of obj "+obj.getClass().getName());
	}
	public T getObj()
	{
		return obj;
	}
}
public class GenMain
{
	public static void main(String[] args)
	{
		Gen<String> g1=new Gen<String>("koushi");
		g1.show();
		System.out.println(g1.getObj());
		
		Gen<Integer> g2=new Gen<Integer>(55);
		g2.show();
		System.out.println(g2.getObj());
	}
}