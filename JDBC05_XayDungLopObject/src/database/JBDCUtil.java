package database;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JBDCUtil
{
	static Connection c = null;
	public static Connection getConnection()
	{
		// dang ki SQL driver
		// Dang ki MySql DRIVER voi drive manager
		  try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			  // Cac thong so
			  String url = "jdbc:mySQL://Localhost:3306/nhasach";
			  String username = "root";
			  String password = "";
			  
			  // Tao ket noi
			  c = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}
	
	public static void closeConnection()
	{
		try {
			if(c!= null)
			{
				c.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}