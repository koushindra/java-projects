package final_pro;
class Bike1
{
	final void run() // final method cann't be overrided
	{
		System.out.println("running");
	}
}
class Honda extends Bike1
{
	//void run()
	{
		System.out.println("running safely with 100 kmph");
	}
}
public class final_method 
{
	public static void main(String[] args)
	{
		Honda h= new Honda();
		h.run();
	}
}// OUTPUT:-.VerifyError: class final_pro.Honda overrides final method run.()
