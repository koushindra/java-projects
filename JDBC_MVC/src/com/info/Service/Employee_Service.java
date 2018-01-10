package com.info.Service;

import java.security.GeneralSecurityException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.util.concurrent.Callable;

import javax.swing.JOptionPane;

import com.info.model.Employee;

public class Employee_Service
{
		public static boolean InsertEmp(Employee emp)
		{
			boolean signal =false;
			try
			{
				Connection con=ConnectionProvider.MakeConnection();
				
				PreparedStatement ps=con.prepareStatement("insert into Employee values(? ,? ,?);");
				ps.setInt(1, emp.getId());
				ps.setString(2, emp.getName());
				ps.setString(3, emp.getDept());
				
				int num=ps.executeUpdate();
				if(num>0)
                      signal=true;				
			}
			
			catch(Exception e)
			{
				System.out.println("Error while Inserting Employee:"+e);
			}
				return signal;
		}

		public static void getEmp(Employee emp)
		{
			boolean flag = true;
			try
			{
				Connection con=ConnectionProvider.MakeConnection();
				PreparedStatement ps=con.prepareStatement(" select * from Employee where id=?");
			    
				ps.setInt(1,emp.getId());
				ResultSet rs=ps.executeQuery();
				//write code if Employee id is not found
				while(rs.next())
				{
					flag = false;
					int Id=rs.getInt("id");  
					String Name=rs.getString("Name");
					String Dept=rs.getString("Dept");
					System.out.println("Id:  "+Id+"   Name:  "+Name+"     Dept:  "+Dept);
				}
				if(flag)
					 
					  JOptionPane.showMessageDialog(null, "Please Enter a vaild Id.");
					//JOptionPane.showMessageDialog(null, "Please Enter a vaild Id.");
			}
			catch(Exception e)
			{
				 System.out.println("Error while getting Emplyee info:"+e);
			}
			//return emp;
		}

		public static boolean DelAllEmp()
		{
			boolean signal=false;
			try
			{
				Connection con =ConnectionProvider.MakeConnection();
				PreparedStatement ps=con.prepareStatement("delete from Employee");
				int num=ps.executeUpdate();
				if(num>0)
                      signal=true;				
			}
			catch(Exception e)
			{
				System.out.println("Error while Deleting Employees"+e);
			}
			return signal;
		}

		public static void ShowAllEmp()
		{
			try
			{
				Connection con=ConnectionProvider.MakeConnection();
	        	PreparedStatement ps;
				System.out.println("Press 1. for Sort by Id \nPress 2. for Sort by name\nPress 3. for Sort by Dept  \nPress 4. for Default order");
				Scanner sc=new Scanner(System.in);
				int choice=Integer.parseInt(sc.nextLine());
				switch(choice)
				{
				case 1:
				        	         ps=con.prepareStatement("select * from Employee order by ID ASC");
				             break;
				case 2:
					              ps=con.prepareStatement("select * from Employee order by Name ASC");
					              break;
				case 3:
		             ps=con.prepareStatement("select * from Employee order by Dept Desc ");

				default:
					             ps=con.prepareStatement("select * from Employee ");
				}
				
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					int id=rs.getInt("id");
					String name=rs.getString("name");
					String dept=rs.getString("dept");
					System.out.println("Id:  "+id+"          Name:  "+name+"          Dept:  "+dept);
					
				}
			}
			catch(Exception e)
			{
				System.out.println("Error: Cann't Show all Employee"+e);
			}
		}

		public static boolean UpdateEmp(Employee emp) 
		{
			boolean signal=false;
			try
			{
				Connection con=ConnectionProvider.MakeConnection();
				PreparedStatement ps=con.prepareStatement("update employee set id=?, name=?, dept=? where id=?");
				Scanner sc =new Scanner(System.in);
				
				System.out.println("Enter new id:");
				ps.setInt(1,Integer.parseInt(sc.nextLine()));
				
				System.out.println("Enter new name:");
				ps.setString(2,sc.nextLine());
				
				System.out.println("Enter new dept");
				ps.setString(3,sc.nextLine());
				ps.setInt(4, emp.getId());
               
				int num=ps.executeUpdate();
				 if(num>0)
					 signal=true;
				 return signal;
			}
			catch(Exception e)
			{
				System.out.println("Error while Updating!!!");
			}
			return signal;
			
		}
}

