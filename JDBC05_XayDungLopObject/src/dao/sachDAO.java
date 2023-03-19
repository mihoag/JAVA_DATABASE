package dao;
import java.sql.Connection;
import java.sql.JDBCType;
import java.sql.Statement;
import java.util.ArrayList;

import database.JBDCUtil;
import model.sach;
public class sachDAO implements DAOinterface<sach> {

	public static sachDAO getInstance()
	{
		return new sachDAO();
	}
	@Override
	public int them(sach t) {
		// TODO Auto-generated method stub
		// Buoc 1 : ket noi voi csdl
		Connection con = JBDCUtil.getConnection();
		// buoc 2: tao statement
		try {
		Statement st = con.createStatement();
		String url = "insert into sach values ('" + t.getId() + "','" + t.getTensach() + "','" + t.getGiaban() + "','" + t.getNamXB()+ "')";
		// buoc 3:
		int check = st.executeUpdate(url);
		// B4
		System.out.println("So dong da cap nhat : " + check);
		if(check >0)
		{
			System.out.println("Insert thanh cong");
		}
		else
		{
			System.out.println("Insert khong thanh cong");
		}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			if(con != null)
			{
				con.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int capnhat(sach t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int xoa(sach t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<sach> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public sach selectById(sach t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<sach> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
