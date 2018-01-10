package ds.multi.pro;
   class MyThread3 extends Thread
{
	public  void start()
	{  super.start();
	  System.out.println("start() is executing by  :" +Thread.currentThread().getName());
	}
	public void run()
	{
		System.out.println("run() is executing by  :" +Thread.currentThread().getName());
	}
}
public class Overriding_start 
{
	public static void main(String[] args)
	{
		System.out.println("currenty running thread :" +Thread.currentThread().getName());
	   MyThread3 t1 =new MyThread3();
	   MyThread3 t2 =new MyThread3();
	    t1.start();
	    t2.start();
    System.out.println("main method "); //this line code will not be executed 
    }//because before this line there is exception in line no 20
	}
 

