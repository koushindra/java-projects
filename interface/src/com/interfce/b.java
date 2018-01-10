package com.interfce;
abstract class c
{
	abstract void callme();
}
public class b extends c
{
	void callme()
	{
		System.out.println("this is callme");
	}
	public static void main(String[] args)
	{
	c obj =new b();
		obj.callme();
	}
}
