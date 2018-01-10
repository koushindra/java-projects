package com.dataTypes;
class Demoo
{
	int a;
}
public class CallByValueDemo3 
{
	public static void func(Demoo obj1, Demoo obj2)
	{
		Demoo temp=obj1;
		obj1=obj2;
		obj2=temp;
	}
	
	public static void main(String[] args)
	{
		Demoo ob1=new Demoo();
		ob1.a=100;
		
		Demoo ob2=new Demoo();
		   	ob2.a=200;
	
		   		func(ob1,ob2);
	
		   		System.out.println("obj1.a ---" +ob1.a);
		   		System.out.println("obj2.a ----" +ob2.a);
	}
}
