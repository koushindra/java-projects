package com.dataTypes;
class Demo1
{
	int a;
}
public class CallByValueDemo2 
{
	public static void main(String[] args)
	{
		int[] n=new int[]{10,20,30,40,50};
		func(n);
		System.out.println("n[1]:  "+n[1]);
	}
	
	public static void func(int num[])
	{
		num[1]=-1000;
	}
	
}
