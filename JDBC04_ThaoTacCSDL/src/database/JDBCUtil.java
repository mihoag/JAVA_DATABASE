package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class JDBCUtil
{
	static Connection c = null;
	// Tao ket noi
	public static Connection getConnection()
	{
		// Dang ki driver sql
		try {
			DriverManager.deregisterDriver(new com.mysql.jdbc.Driver());
			// Cac thong so
			String url = "jdbc:mySQL://Localhost:3306/thongtinsinhvien";
			String username = "root";
			String password = "";
			
			// ket noi
			c =DriverManager.getConnection(url, username, password);			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}