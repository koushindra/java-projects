package ds.multi.pro;
class MyThreadj extends Thread 
{
	public void run()
	{
		for (int i=0; i<3; i++)
		{
			System.out.println("Seeta thread");
			try{Thread.sleep(2000);}
			catch(InterruptedException e){  }
		}
	}
}
public class join_demo 
{
	public static void main(String[] args) throws InterruptedException
	{
		MyThreadj t= new MyThreadj();
		t.start();
		t.join(2000);
		for(int i=0; i<3; i++)
		{
			System.out.println("Rama Thread");
		}
	}
}
