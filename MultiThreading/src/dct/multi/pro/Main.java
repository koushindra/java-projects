package dct.multi.pro;

public class Main 
{   
	 public static void VerifyEmp(String Name)
	 {	
		 System.out.println(Name+"'s verification is started...");
		 try
		 {
			 Thread.sleep(5000);
		 }
		 catch(Exception e)  {   }
		 System.out.println(Name+"'s veificitation is done");
		 
	 }
	public static void main(String[] args)
	{
		System.out.println("Main thread starts...");
		VerifyEmp("koushindra kumar");
		VerifyEmp("ks gujjar");
		
		System.out.println("Main thread ends here...");  
	}
}
