package com.info.main;
import java.sql.Connection;
import java.util.Scanner;

import com.info.service.Employee_Service;
public class Main 
{
	 public static void main(String[] args)
	   {
		  System.out.println("*******select any option**********");
		  System.out.println("1.press 1 for SHOW an employee details");
		  System.out.println("2. Press 2 for INSERT an Employee");
		  System.out.println("3. Press 3 for DELETE All Employee details");
		  System.out.println("4. Press 4 for DELETE one Employee details");
		 System.out.println("5. Press 5 for SHOW all employee details");
		  System.out.println("6.  exit");
		  
		  Scanner sc =new Scanner(System.in);
		  int ch=sc.nextInt();
		  
		  switch(ch)
		  {
		  case 1: 
			   System.out.println("Enter employee id");
			   int  id=sc.nextInt();
			   Employee_Service.getEmp(id);
			  break;
			  
		  case 2: 
			      System.out.println("insert employee details");
			      System.out.println(" Enter Id:");                 int id1=sc.nextInt();
			      System.out.println(" Enter Name:");			  String name=sc.next();
			      System.out.println(" Enter Dept:");			 String dept=sc.next();
			     
			      Employee_Service.InsertEmp(id1 , name , dept);
			      break;
			      
		  case 3:
			  			
			  Employee_Service.DelAllEmp();			break;
			  
		  case 4:
			  System.out.println("Enter employee id");
			   int  id2=sc.nextInt();
			  Employee_Service.DelEmp(id2);       break;
			  			
		  case 5:
			  Employee_Service.ShowAll();                break;
		 
		  case 6:
			   	System.out.println("**********Thank you******");
			   	System.exit(0);
			}
	  
}
}
