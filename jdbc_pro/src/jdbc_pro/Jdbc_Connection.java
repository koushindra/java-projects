package jdbc_pro;
import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc_Connection 
{
		public static void main(String[] args)
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newstudent", "root", "12345678");
				if(con!=null)
					System.out.println("Okay!!!!");
			}
			
			catch(Exception  e)
			{
				System.out.println("error: "+e);
			}
		}
}
