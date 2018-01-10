package ds.multi.pro;
// MyThread is difined in extendingThread.java

public class ds_Approach 
{
	public static void main(String[] args)
	{
		MyThread t = new MyThread();
		Thread t1= new Thread(t);
		t1.start();
		System.out.println("main method ");
		
	}
}
