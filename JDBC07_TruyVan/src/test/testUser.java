package test;

import dao.DAOuser;
import model.user;

public class testUser {
public static void main(String[] args) {
	user u = new user("","minhduy","");
	try {
		user us = DAOuser.getInstance().selectById(u);
		System.out.println(us);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	
}
}
