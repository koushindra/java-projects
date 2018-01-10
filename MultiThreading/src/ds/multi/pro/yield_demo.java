package ds.multi.pro;
class MyThready extends Thread 
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("child thread");
			Thread.yield();
		}
	}
}
public class yield_demo 
{
	public static void main(String[] args)
	{
		MyThready t=new MyThready();
		t.start();
		for(int i=0; i<5; i++)
		{
			System.out.println("main thread");
		}
	}
}
