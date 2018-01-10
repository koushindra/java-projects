package com.interfce;
interface callback
{
	void callback(int parameter);
}
class clients implements callback
{
	public void callback(int p)
	{
		System.out.println("callback inside client called with:"+p);
	}
	
}
class client2 implements callback
{
	public void callback(int p)
	{
		System.out.println("another version of callback");
		System.out.println("p  squared is :" +(p*p));
	}
}
public class demo1
{
	public static void main(String args[])
	{
		callback c =new clients(); 
		client2 obj= new client2();
		c.callback(42);    
		
		c=obj; // c now refers to cllient2 object
		c.callback(10);
	}
}
