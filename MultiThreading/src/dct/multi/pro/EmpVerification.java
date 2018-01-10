package dct.multi.pro;
class verify implements Runnable
{
	String name;
	
	public verify(String name)
	{
		this.name=name;
	}
	public  synchronized  void run()
	{
		System.out.println(name+ "'s verification is started...");
		try{Thread.sleep(5000);}
		catch(Exception e)   {  }
	System.out.println(name+"'s verification is done!!!");
}}
public class EmpVerification 
{
	public static void main (String[] args)
	{
		Runnable r1=new verify("koushi");
		
		Thread t1=new Thread(r1);
		t1.start();
		
		Runnable r2= new verify("koushindra");
		Thread t2 = new Thread(r2);
		t2.start();
		
	}
}
