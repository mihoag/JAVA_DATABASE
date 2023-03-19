package test;
import java.sql.Connection;
import java.sql.JDBCType;

import database.*;
import model.khachhang;
import model.sach;
import dao.sachDAO;
public class test {
   public static void main(String[] args) {
    sach s = new sach("001","Cau truc du lieu va giai thuat",50000,2021);
    sachDAO t = sachDAO.getInstance();
    t.them(s);
}
}
