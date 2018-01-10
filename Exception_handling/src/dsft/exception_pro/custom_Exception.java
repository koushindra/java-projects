package dsft.exception_pro;
class MyException extends Exception
{
	@Override
	public String toString()
	{
		return "Data entered contain empty values";
	}
}
public class custom_Exception
{
	public static void print(String name , String dept)throws MyException  //here throwing custom Exception
	{
		if(name!=null && dept!=null)
		{
			if(name.length()>0 &&dept.length()>0)
			{
					System.out.println("Name:"+name+"   Dept:"+dept);
			}
			else
			{
				throw new MyException();    // throwing custom Exception object by using throw keyword
			}
		}
	}
	public static void main(String[] args)
	{
		String name="koushi";
		String dept="";
		
		try
		{
			print(name,dept);
		}
		catch(MyException e)
		{
			System.out.println(e); 
			//System.out.println(e);   // ==e.toString() because toString() is called implicitly while calling println() 
		}                           // method PrintStream class and e is object of MyException class    
	}// if we dont't override toString() method then output is fully specified path of class which object is called
	 // here output : dsft.exception_pro.MyException
}
