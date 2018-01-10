package com.info.rev;

 class Emp implements Runnable
{
	String name;
	 Emp(String name)
	{
		this.name=name;
	}
	
	public void run()
	{
		System.out.println(name+"'s verificitaion is started... ");
		try{ Thread.sleep(6000);}
		catch(Exception e){}
		System.out.println(name+"'s verification is done!!!!");
	}
}

class Empverification
{
	public static void main(String[] args)
	{
		Emp emp=new Emp("koushi");
		
	}
}