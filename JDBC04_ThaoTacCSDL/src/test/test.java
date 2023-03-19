package test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import database.JDBCUtil;

public class test
{
	public static void main(String[] args) {
		// Buoc 1 : khoi tao ket noi
		Connection c = JDBCUtil.getConnection();
		System.out.println(c);
		// Buoc 2: tao statement
		Statement st;
		try {
			st = c.createStatement();
			// buoc3:
			String sql = "insert into sinhvien values (\"To Phuong Hieu\",\"21120453\",\"CTT4\")";
			int check = st.executeUpdate(sql);
			System.out.println("So dong bi thay doi :" + check);
			// Buoc 4: xu li du lieu
			System.out.println("so dong bi thay doi : " + check);
			if(check > 0)
			{
				System.out.println("Insert thanh cong");
			}
			else
			{
				System.out.println("Insert khong thanh cong");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Buoc 5: dong ket noi
		JDBCUtil.closeConnection();
	}
}