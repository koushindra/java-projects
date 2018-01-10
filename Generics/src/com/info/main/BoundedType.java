package com.info.main;

class Gen1<T extends Number>  // we can pass Number or its child class as TYPE PARAMETER
{
	public void operator(T a, T b)
	{
		//System.out.println("the addition is :"+(a+b));
		//System.out.println("multiplication is :"+a*b);
		//System.out.println("division is :"+a/b);
		
		System.out.println("the value of a  and b are: "+a+" "+b);
	}
}

public class BoundedType 
{
	public static void main(String[] args)
	{
		Gen1<Integer> obj=new Gen1<Integer>();
		obj.operator(30, 40);
		
		Gen1<Float> obj2=new Gen1<Float>();
		obj2.operator(5.3, 6.6);
		
		//Gen1<String> obj2=new Gen1<String>();
		
	}
}
