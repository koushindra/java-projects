package com.info.Service;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Driver;

public class ConnectionProvider
{
	   public static Connection con=null;
		public static Connection MakeConnection()
		{
			if(con==null)
			{ 
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","12345678");
				}
			catch(Exception e)
				{
				System.out.println("Error while making connection:");
				}
				return con;
			}
			else
			{
				return con;
			}
		}
}
