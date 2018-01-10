package com.dataTypes;
class Demo
{
	int a;
}
public class CallByValue 
{
	public static void func(Demo obj)
	{
		obj.a=-1000;
	}
	public static void main(String[] args)
	{
		Demo obj =new Demo();
		obj.a=100;
		func(obj);
		System.out.println("A:"+obj.a);
	}
}
