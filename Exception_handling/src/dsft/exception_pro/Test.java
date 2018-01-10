package dsft.exception_pro;

class throwsuse extends Thread 
{
	
	public synchronized void run()
	{
		System.out.println("child thread");
		 for(int i=0; i<9; i++)
			{
				System.out.println("main thread");
				try 
				{
					Thread.sleep(6756);
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
	}
}


public class Test 
{
	public static void main(String[] args) throws InterruptedException
	{
	  Thread t1=new throwsuse();
	 Thread t2=new throwsuse();
	  Thread t3=new throwsuse();
	  t1.start();
	  t2.start();
	 t3.start();
	  for(int i=0; i<9; i++)
		{
			System.out.println("main thread");
			Thread.sleep(6756);
		}
	
}
}
