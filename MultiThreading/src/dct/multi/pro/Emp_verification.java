package dct.multi.pro;
class verify2 extends Thread
{
	String name;
	public verify2(String name)
	{
		this.name=name;
	}
	public   void run()
	{
		System.out.println(name+ "'s verification is started...");
		
		try{Thread.sleep(1000);}
		catch(Exception e)   {  }
		
	System.out.println(name+"'s verification is done!!!");
    }
}
public class Emp_verification 
{
	public static void main (String[] args)
	{
		Thread t=new verify2("koushi");   //upcasting
		t.start();
		
		
		Thread t1=new verify2("ks");
		t1.start();
	}
}
