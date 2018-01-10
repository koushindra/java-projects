package final_pro;
class Bike
{
}
class honda extends Bike
{
	void run()
	{
		System.out.println("running safely");
	}
}

public class final_class 
{
	public static void main(String[] args )throws ClassNotFoundException,IllegalAccessException,InstantiationException
	{
		/*honda h= new honda();
		h.run();*/
	//	Class c=Class.forName("final_pro.honda"); // used fully qualified path
	//	Class c=honda.getClass();  //compile error: becoz getClass requied object for getting object
		Class c=honda.class;
		honda h=(honda)c.newInstance();
		h.run();
		
	}
}
