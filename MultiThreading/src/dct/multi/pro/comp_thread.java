package dct.multi.pro;
class MyRunnable implements Runnable
{
	company  c=null;
	MyRunnable(company comp)
	{ 
		c=comp;
	}
	public void run()
	{
		while(true)
		{
			int from=(int)(100*Math.random());
			int to =(int)(100*Math.random());
			int amount= (int)(1000*Math.random());
			c.transfer(from, to, amount);
			//c.show_total();
		}
	}
}
public class comp_thread 
{
	public static void main(String[] args)
	{
		company comp=new company();
		Runnable r1 =new MyRunnable(comp);
		Thread t1=new Thread(r1);
		t1.start();
		Runnable r2 =new MyRunnable(comp);
		Thread t2=new Thread(r2);
		t2.start();
	}
}
