package test;
import java.util.ArrayList;

import dao.DAOKhachHang;
import model.khachhang;

public class testkhachhang {
    public static void main(String[] args) {
    	ArrayList<khachhang> arr = new ArrayList<khachhang>();
		arr = DAOKhachHang.getInstance().selectAll();
		for(int i = 0 ; i < arr.size() ; i++)
		{
			System.out.println(arr.get(i).toString());
		}
	}
}
