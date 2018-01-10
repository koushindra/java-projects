package synchro_example;

public class SynchronizedInstance extends Thread
{
	public void run()
	{
		m1();
		m2();
	}
				public synchronized void m1()
				{
					for(int i=0; i<10; i++)
					{
						System.out.println("m1() method is executing...");
					}
				}
				public synchronized void m2()
				{
					for(int i=0; i<10; i++)
					{
						System.out.println("m2() method is executing...");
					}
				}
	
	public static void main(String[] args)
	{
		SynchronizedInstance s=new SynchronizedInstance();
		Thread t=new Thread(s);
		t.start();
		
	}
}
