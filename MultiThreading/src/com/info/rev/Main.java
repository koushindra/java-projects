package com.info.rev;

 class Main 
{
	public static void verify(String name )
	{
		System.out.println(name+"'s verification is started... ");
		
		try
		{
			Thread.sleep(7000);
		}
		
		catch(Exception e)
		{
			System.out.println(name+"'s verification is done!!!");
		}
	}
	
	public static void main(String[] args)
	{
		verify("koushi");
		verify("ks");
		System.out.println("main threads ends");
	}
}
