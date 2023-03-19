package dao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.khachhang;
import database.*;
public class DAOKhachHang implements DAOinterface<khachhang>{

	public static DAOKhachHang getInstance()
	{
		return new DAOKhachHang();
	}
	@Override
	public int them(khachhang t) {
		// TODO Auto-generated method stub
		// B1: tao ket noi voi co so du lieu
		Connection con  = JBDCUtil.getConnection();
		// B2: tao ra doi tuong statement
		try {
			Statement st = con.createStatement();
			String sql = "insert into sach values (" +t.getId() + "," + t.getHoten()+ "," + t.getNgaysinh().toString()+","+t.getDiachi() +")";
			
			
			// B3
			int check = st.executeUpdate(sql);
			System.out.println("So dong da cap nhat : " + check);
			if(check > 0)
			{
			System.out.println("Insert khong thanh cong");
			}
			else
			{
				System.out.println("Insert khong thanh cong");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
	// 
		return 0;
	}

	@Override
	public int capnhat(khachhang t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int xoa(khachhang t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<khachhang> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public khachhang selectById(khachhang t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<khachhang> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
