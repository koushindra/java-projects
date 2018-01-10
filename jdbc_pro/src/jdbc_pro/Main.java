
package jdbc_pro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public static void DelEmp(int id)
{
	try
	   {
		   Class.forName("com.mysql.jdbc.Driver");
		   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "12345678");
	   
		   Statement stmt = con.createStatement();
		   String query= "delete  from Employee WHERE id= "+id;
		   
		   ResultSet rs=stmt.executeQuery(query);
		   while(rs.next())
		   {
			   int Id=rs.getInt("id");
			   String name=rs.getString("name");
			   String dept= rs.getString("dept");
			 System.out.println();
			 
		   }
	   }
	catch(Exception e)
	{
		System.out.println("Error :"+e);
	}




public class Main 
{
	public static void getEmp(int id)
	{
		try
		   {
			   Class.forName("com.mysql.jdbc.Driver");
			   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "12345678");
		   
			   Statement stmt = con.createStatement();
			   String query= "Select * from Employee WHERE id= "+id;
			   
			   ResultSet rs=stmt.executeQuery(query);
			   while(rs.next())
			   {
				   int Id=rs.getInt("id");
				   String name=rs.getString("name");
				   String dept= rs.getString("dept");
				 System.out.println();
				 
				//if (Id==id)
					System.out.println("id:"+Id+"   name:"+name+"     dept:"+dept);
			
			   }
		   }
		catch(Exception e)
		{
			System.out.println("Error : "+e);
		}
	}
	public static void InsertEmp(int id,String name, String dept)
	{
		try
		   {
			   Class.forName("com.mysql.jdbc.Driver");
			   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "12345678");
		   
			   Statement stmt = con.createStatement();
			String query=   "insert into Employee values( "+id+" ,' "+name+" '  ,' " +dept+" ')" ;
			int num=stmt.executeUpdate(query);
			
			if(num>0)
		       System.out.println("INSERTION IS DONE!!!");
		   }
		catch(Exception e)
		{
			System.out.println("Error : "+e);
		}
				
	}
	
	public static void  DelAllEmp()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "12345678");
		   
			   Statement stmt = con.createStatement();
			   String query="delete  from Employee";
			   int num=stmt.executeUpdate(query);
			 
			   if(num>0)
				   System.out.println("DELETION IS DONE!!!");
			   else
				   	System.out.println("ID DOES NOT EXIST");
		}
	catch(Exception e)
		{
				System.out.println("Error:  "+e);
		}
	}

	
 public static void ViewAll()
 {
		try
		  {
					 	Class.forName("com.mysql.jdbc.Driver");
					   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "12345678");
				   
					   Statement stmt = con.createStatement();
					   String query="select * from Employee";
					   
					   ResultSet rs=stmt.executeQuery(query);
					   
					   while(rs.next())
					   {
						   int Id=rs.getInt("id");
						   String name=rs.getString("name");
						   String dept= rs.getString("dept");
						 System.out.println();
						 
							System.out.println("id:"+Id+"   name:"+name+"     dept:"+dept);
							
				        }
			   }
		catch(Exception e)
		{
			System.out.println("Error : "+e);
		}
}
   public static void main(String[] args)
   {
	  System.out.println("*******select any option**********");
	  System.out.println("1.press 1 for an employee details");
	  System.out.println("2. Press 2 for Insert an Employee");
	  System.out.println("3. Press 3 for delete All Employee details");
	 System.out.println("4. Press 4 for Viewing all employee details");
	  System.out.println("5.  exit");
	  
	  Scanner sc =new Scanner(System.in);
	  int ch=sc.nextInt();
	  
	  switch(ch)
	  {
	  case 1: 
		   System.out.println("Enter employee id");
		   int  id=sc.nextInt();
			getEmp(id);
		  break;
		  
	  case 2: 
		      System.out.println("insert employee details");
		      System.out.println(" Enter Id:");                 int id1=sc.nextInt();
		      System.out.println(" Enter Name:");			  String name=sc.next();
		      System.out.println(" Enter Dept:");			 String dept=sc.next();
		     
		    InsertEmp(id1 , name , dept);
		      break;
		      
	  case 3:
		  			
		  			DelAllEmp();			break;
		  			
	  case 4:
		            ViewAll();                break;
		           
	  case 5:
		  
	  case 6:
		   	System.out.println("**********Thank you******");
		   	System.exit(0);
		}
   
}}
