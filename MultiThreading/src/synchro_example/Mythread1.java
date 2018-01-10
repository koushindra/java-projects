package synchro_example;
class Mythread1 extends Thread
{
	Display d;
	Mythread1(Display obj)
	{
		d=obj;
		
	}
	public void  run()
	{
		d.Displayn();
	}
}
class Mythread2 extends Thread
{
	Display d;
	Mythread2(Display obj)
	{
		d=obj;
	}
	public void run()
	{
		d.Displayc();
	}
}