package com.info.main;

import java.util.Scanner;

import javax.swing.JOptionPane;

import com.info.Service.Employee_Service;
import com.info.model.Employee;

public class Main 
{
		public static void main(String[] args)
		{  	
			
		    System.out.println("1. Enter 1 for Inserting Employee ");
			System.out.println("2. Enter 2 for Getting an Employee");
			System.out.println("3. Enter 3 for Deleting All Employee");
			System.out.println("4. Enter 4 for Show All   Employee in SORTED ORDER");
			System.out.println("5. Enter 5 for Update An Employee ");
			System.out.println(". Exit");
			
			Scanner sc=new Scanner(System.in);
		    int Choice=Integer.parseInt(sc.nextLine());
		
			switch (Choice)
			{
			case 1:
				System.out.print("Enter the id: ");
				int id=Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter the name: ");
				String name=sc.nextLine();
				
				System.out.println("Enter the dept: ");
				String dept=sc.nextLine();
				
				Employee emp=new Employee(id,name,dept);
				boolean flag=Employee_Service.InsertEmp(emp);
				if(flag)
					System.out.println("INSERTION IS DONE");
				else
					System.out.println("Not Inserted!!!");

				break;

				
			case 2:
				 
				    System.out.println("Enter Employee Id:");
				    int Id=Integer.parseInt(sc.nextLine());
				    Employee emp1=new Employee(Id);
				    
				     Employee_Service.getEmp(emp1);
		          		            break;
		            
		            
			case 3:
				      flag=Employee_Service.DelAllEmp();
				      if(flag)
				    	  System.out.println("Deletion is done");
				      else
				    	  System.out.println("Nope!!!");
				        break;
			
			
			case 4:
				         Employee_Service.ShowAllEmp();
				          break;
				    
			case 5: 
				        System.out.println("Enter Employee Id");
				        id=Integer.parseInt(sc.nextLine());
				        emp=new Employee(id);	
				        flag= Employee_Service.UpdateEmp(emp);
				        
				        if(flag)
				        {
				        	System.out.println("UPDATION IS DONE");
				            Employee_Service.ShowAllEmp();
				        }
				        else
				        		System.out.println("ENTERED ID IS NOT FOUND");
			
			default:
				break;
			}
		}
}
