package database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class JDBCUtil
{
	static Connection c = null;
	public static Connection getConnection()
	{
		
		try {
		// Dang ki MySql DRIVER voi drive manager
		  DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		  // Cac thong so
		  String url = "jdbc:mySQL://Localhost:3306/vidu";
		  String username = "root";
		  String password = "";
		  
		  // Tao ket noi
		  c = DriverManager.getConnection(url, username, password);
		  
		} catch (Exception e) {
		e.printStackTrace();
		}
		
		return c;
	}
	
	public static void closeConnection()
	{
		try {
			if(c != null)
			{
				c.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void printInfo()
	{
		if (c != null)
		{
			try {
				DatabaseMetaData mtdt = c.getMetaData();
				System.out.println(mtdt.getDatabaseProductName());
				System.out.println(mtdt.getDatabaseProductVersion());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}