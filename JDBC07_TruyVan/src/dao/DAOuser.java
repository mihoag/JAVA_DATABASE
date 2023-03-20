package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import JDBCUtil.JDBCUtil;
import model.user;

public class DAOuser implements DAOinterface<user> {

	public static DAOuser getInstance()
	{
	    return new DAOuser();
	}
	@Override
	public int them(user t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int capnhat(user t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int xoa(user t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<user> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public user selectById(user t) {
		// TODO Auto-generated method stub
		ArrayList<user> arr = new ArrayList<user>();
		Connection con = JDBCUtil.getConnection();
		try {
			String url = "select * from user where user = ?";
			PreparedStatement pst= con.prepareStatement(url);
			pst.setString(1, t.getUser());
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				String pass = rs.getString("pass");
				String user = rs.getString("user");
				String name = rs.getString("name");
				
				arr.add(new user(pass,user,name));
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return arr.get(0);
	}

	@Override
	public ArrayList<user> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
