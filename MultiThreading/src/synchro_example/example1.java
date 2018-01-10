package synchro_example;

public class example1 
{
	public static void main(String[] args)
	{
	Display obj=new Display();
	Mythread1 t1=new Mythread1(obj);
	Mythread2  t2= new Mythread2(obj);
	 t1.start();
	 t2.start();
	}
}
