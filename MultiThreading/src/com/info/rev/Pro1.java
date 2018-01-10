package com.info.rev;

class Mythread extends Thread
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println(" child thread executing ...");
		}
	}
}
public class Pro1 
{
	public static void main(String[] args)
	{
		Mythread t=new Mythread();
		t.start();
		
		for(int i=0; i<5; i++)
		{
			System.out.println("main thread is executing...");
		}
	}
}

