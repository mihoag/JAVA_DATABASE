package test;

import model.sach;
import dao.sachDAO;
public class testSach {
public static void main(String[] args) {
	for(int i = 0 ; i < 10;i++)
	{
		sach s = new sach(i + "","Sach " + i,20000,2022);
	    sachDAO.getInstance().xoa(s);
	}
	
	
}
}
