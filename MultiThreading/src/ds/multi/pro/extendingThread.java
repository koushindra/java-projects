package ds.multi.pro;
final class MyThread extends Thread
{
	public void run()
	{
		System.out.println("outside for loop:"+"this.getname"+this.getState());

		for(int i=0; i<2; i++)
		{
			System.out.println("child thread");
			System.out.println("inside for loop:"+this.getState());

		}
	}
}
public class extendingThread 
{
	public static void main(String[] args)
	{
		MyThread t = new MyThread();
		System.out.println(t.getState());
		t.start();
		
		for (int i=0; i<4; i++)
		{
		System.out.println("main thread");	
	    }
		
		System.out.println("after main loop: "+t
				.getState());
		
   }
} 

// output:- here will be mixed output
