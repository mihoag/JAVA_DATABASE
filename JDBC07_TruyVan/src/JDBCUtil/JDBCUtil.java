package JDBCUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class JDBCUtil {
	static Connection c = null;
public static Connection getConnection()
{
	
	try {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		//
		String url = "jdbc:mySQL://Localhost:3306/nhasach";
		String username = "root";
		String pass = "";
		c = DriverManager.getConnection(url, username, pass);
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
		e.printStackTrace();
		// TODO: handle exception
	}
}
}
