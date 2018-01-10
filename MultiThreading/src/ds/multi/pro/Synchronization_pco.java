package ds.multi.pro;

class Display
{
	public  void talk(String name)
	{
		for(int i=0; i<5; i++)
		{
			System.out.println(name+" is talking. Please wait...");
			try{Thread.sleep(2000);}
			catch(InterruptedException e){  }	
			System.out.println(name+" is coming out. now you can enter!!!");
		}
		//System.out.println(name+" is coming out. now you can enter!!!");
	}
}
class MyThreadp extends Thread
{
	Display d;
	String name;
	MyThreadp(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.talk(name);
	}
}
public class Synchronization_pco 
{
 public static void main(String[] args)
 {
	 Display d=new Display();
	 MyThreadp t1 =new MyThreadp(d,"RAM");
	 MyThreadp t2 =new MyThreadp(d, "Mohan");
	 t1.start();
	 t2.start();
 }
}
