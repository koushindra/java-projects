package ds.multi.pro;
class MyRunnable implements Runnable
{
	public void run()
	{   System.out.println("\nrunning thread inside run() method: " 
		      +Thread.currentThread().getName()+"\n");
		for(int i=0; i<4; i++)
		{    
			System.out.println("child thread ");
		}
	}
}
public class implement_Runnable 
{
	public static void main(String[] args)
	{  
		System.out.println("running thread inside main() method:   " 
	   +Thread.currentThread().getName()+"\n");
	
		MyRunnable r= new MyRunnable(); 
		Thread t1= new Thread(r);
		t1.start();
		
		
		System.out.println(t1.getId());	
		System.out.println(t1.currentThread().hashCode());
		System.out.println(t1.currentThread().isInterrupted());
		System.out.println(t1.currentThread().getStackTrace());
	
		//t1.getStackTrace();
	System.out.println(	t1.getClass());
		/*Thread t2=new Thread();        // without passing runnable object
		t2.start();*/
		
		for(int i=0; i<2; i++)
		{
			System.out.println("main thread");
		}
		
	}
}
