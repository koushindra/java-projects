package ds.multi.pro;
class MyThread5 extends Thread
{
}
public class Priority_Demo 
{
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(8);
		MyThread5 t= new MyThread5();
		System.out.println(t.getPriority());
	}
}/*child thread inherit priority from parent thread.
   The default priority for main thread is 5
   but for all ramaining thread default priority is inherited from 
   parent thread(not by parent class).
   max prioritry is 10 and min priority is 1*/
