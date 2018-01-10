package com.info.rev;

import java.io.PrintStream;

public class Test extends Thread
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			try{
				Thread.sleep(500);
			}
			catch (InterruptedException exc) 
			{
				System.out.println("the exeception is "+exc);
			}
		PrintStream p=	System.out;
		
			p.println(Thread.currentThread().getName().toUpperCase()+"  is executing");
		}
	}
	
	public static void main(String[] args)
	{
		Test t1=new Test();
		t1.start();
		
		/*try 
		 * {
			t1.join();
		} 
		catch (InterruptedException e1)
		 {
			e1.printStackTrace();
		}
		*/
		
		Test t2=new Test();
		t2.start();
		
		try 
		{
			t2.join();
		}
		catch (InterruptedException e1) 
		{
			e1.printStackTrace();
		}
		
		for(int i=0; i<5; i++)
		{
			try{ Thread.sleep(500);} 
			catch (InterruptedException e) {
				System.out.println("Exception in Thread "+Thread.currentThread());
			}
			System.out.println(Thread.currentThread().getName().toUpperCase()+" is executing");
		}
	}
}
