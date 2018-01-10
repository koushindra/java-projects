package com.info.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class Employee_Service 
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
				System.out.println("Error while getting Employee details : "+e);
			}
	}
		
	public static void InsertEmp(int id,String name, String dept)
	{
		try
	     {
				   Class.forName("com.mysql.jdbc.Driver");
				   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "12345678");
			   
				/*   Statement stmt = con.createStatement();
				String query=   "insert into Employee values( "+id+" ,' "+name+" '  ,' " +dept+" ')" ;
				int num=stmt.executeUpdate(query);    */
				   PreparedStatement ps=con.prepareStatement("insert into Employee values( ?, ? , ?  )");
				   ps.setInt(1, id);
				   ps.setString(2, name);
				   ps.setString(3, dept);
				    
				int num=ps.executeUpdate();
				if(num>0)
			       System.out.println("INSERTION IS DONE!!!");
		  }
			catch(Exception e)
			{
				System.out.println("Error while INSERTING details : "+e);
			}
					
	}
		
	public static void  DelAllEmp()
	{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "12345678");
			   
				  /* Statement stmt = con.createStatement();
				   String query="delete  from Employee";*/
				   
				   PreparedStatement ps=con.prepareStatement("delete from Employee");
				   int num=ps.executeUpdate();
				 
				   if(num>0)
					   System.out.println("DELETION IS DONE!!!");
				   else
					   	System.out.println("ID DOES NOT EXIST");
			}
		catch(Exception e)
			{
					System.out.println("Error while Deleting:  "+e);
			}
	}
	
	public static void DelEmp(int id)
	{
		try
		   {
			   Class.forName("com.mysql.jdbc.Driver");
			   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "12345678");
		  
        	   PreparedStatement ps=con.prepareStatement("delete from Employee where id=?");
			   ps.setInt(1, id);
			   int num=ps.executeUpdate();

			   if(num>0)
				   System.out.println("DELETION IS DONE!!!");
			   else
				   System.out.println("ID NOT FOUND");
		   }
		catch(Exception e)
		{
			System.out.println("Error while deleting :"+e);
		}

	}

   public static void ShowAll()
    {
		try
		{
						 	Class.forName("com.mysql.jdbc.Driver");
						   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "12345678");
					   
						/*  Statement stmt = con.createStatement();
						  String query="select * from Employee";
						   ResultSet rs=stmt.executeQuery(query);  */
						   
						   PreparedStatement ps=con.prepareStatement("select * from Employee");
						   ResultSet rs =ps.executeQuery();
						  
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

	
}