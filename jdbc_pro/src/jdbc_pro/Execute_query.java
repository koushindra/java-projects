package jdbc_pro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Execute_query 
{
		public static void main(String[] args)
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newstudent", "root", "12345678");
			
			Statement stmt=con.createStatement();
			String query="Select * from  newstudent";
			 
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next())
			{
				int id=rs.getInt("roll");
				String name=rs.getString("stu_name")
			
				
			}
		    
		}
		
}
