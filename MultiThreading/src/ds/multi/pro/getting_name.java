package ds.multi.pro;
class MyThread4 extends Thread
{
}
public class getting_name 
{
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getName());
		MyThread4 t= new MyThread4();
		System.out.println(t.getName());
		
		Thread.currentThread().setName("koushi");
		System.out.println(Thread.currentThread().getName());
	}
}
