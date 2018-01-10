package dct.multi.pro;
class MyyThread extends Thread
{
	String name;
	MyyThread(String name)
	{
		this.name=name;
	}
	public void run()
	{
		for(int i=0; i<2; i++)
		{
			System.out.println(name);
		}
	}
}
public class extending_Thread 
{
	public static void main(String[] args)
	{
		Thread t1=new MyyThread("koushi ");
		t1.start();
		Thread t2 =new MyyThread("ks. gujjar");
		t2.start();
	}
}
