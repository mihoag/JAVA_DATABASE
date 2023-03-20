package dao;
import java.sql.Connection;
import java.sql.ResultSet;

import JDBCUtil.JDBCUtil;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.khachhang;
public class DAOKhachHang implements DAOinterface<khachhang>{

	public static DAOKhachHang getInstance()
	{
		return new DAOKhachHang();
	}
	@Override
	public int them(khachhang t) {
		// TODO Auto-generated method stub
		// B1: tao ket noi voi co so du lieu
		Connection con  = JDBCUtil.getConnection();
		// B2: tao ra doi tuong statement
		try {
			Statement st = con.createStatement();
			String sql = "insert into khachhang values ('" +t.getId() + "','" + t.getHoten()+ "','" + t.getNgaysinh()+"','"+t.getDiachi() +"')";
			System.out.println(sql);
			
			// B3
			int check = st.executeUpdate(sql);
			System.out.println("So dong da cap nhat : " + check);
			if(check > 0)
			{
			System.out.println("Insert  thanh cong");
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
		//
		Connection con  = JDBCUtil.getConnection();
		try {
			Statement st = con.createStatement();
			String url = "update khachhang set id = '" + t.getId() + "', hoten = '" +t.getHoten() + "' , ngaysinh = '" + t.getNgaysinh() + "' , diachi = '" + t.getDiachi() + "' where id = '" + t.getId() + "'";
			System.out.println(url);
		   int check = st.executeUpdate(url);
		   if(check > 0)
			{
			System.out.println("Update  thanh cong");
			}
			else
			{
				System.out.println("Update khong thanh cong");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int xoa(khachhang t) {
		// TODO Auto-generated method stub
		Connection con  = JDBCUtil.getConnection();
		try {
			Statement st = con.createStatement();
			String url = "delete from khachhang where id = '" + t.getId() + "'";
			st.executeUpdate(url);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public ArrayList<khachhang> selectAll() {
		// TODO Auto-generated method stub
		ArrayList<khachhang> arr = new ArrayList<khachhang>();
		Connection con = JDBCUtil.getConnection();
		try {
			Statement st = con.createStatement();
			String url = "select * from khachhang";
			ResultSet rs = st.executeQuery(url);
			
			while(rs.next())
			{
				int id = rs.getInt("id");
				String hoten = rs.getString("hoten");
				String ngaysinh   = rs.getDate("ngaysinh").toString();
				String diachi = rs.getString("diachi");
				
				khachhang kh = new khachhang(id,hoten,ngaysinh,diachi);
				arr.add(kh);
			}
		
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return arr;
	}

	@Override
	public khachhang selectById(khachhang t) {
		// TODO Auto-generated method stub
		ArrayList<khachhang> arr = new ArrayList<khachhang>();
		Connection con = JDBCUtil.getConnection();
		try {
			Statement st = con.createStatement();
		    String url = "select * from khachhang where id = '" + t.getId() + "'";
		    ResultSet rs = st.executeQuery(url);
		    
		    while(rs.next())
		    {
		    	int id = rs.getInt("id");
				String hoten = rs.getString("hoten");
				String ngaysinh   = rs.getDate("ngaysinh").toString();
				String diachi = rs.getString("diachi");
				
				khachhang kh = new khachhang(id,hoten,ngaysinh,diachi);
				arr.add(kh);
		    }
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return arr.get(0);
	}

	@Override
	public ArrayList<khachhang> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		ArrayList<khachhang> arr = new ArrayList<khachhang>();
		Connection con = JDBCUtil.getConnection();
		try {
			Statement st = con.createStatement();
			String url = "select * from khachhang where " + condition;
			ResultSet rs = st.executeQuery(url);
			
			while(rs.next())
			{
				int id = rs.getInt("id");
				String hoten = rs.getString("hoten");
				String ngaysinh   = rs.getDate("ngaysinh").toString();
				String diachi = rs.getString("diachi");
				
				khachhang kh = new khachhang(id,hoten,ngaysinh,diachi);
				arr.add(kh);
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
		return arr;
	}

}
