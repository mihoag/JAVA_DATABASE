package test;

import model.khachhang;
import dao.DAOKhachHang;
public class testKhachhang {
	public static void main(String[] args) {
		khachhang kh = new khachhang(001,"Le Minh Quoc","2003-01-29","Khanh Hoa");
		DAOKhachHang.getInstance().xoa(kh);	
	}
}
