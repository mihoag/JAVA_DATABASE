package dao;

import java.util.ArrayList;

public interface DAOinterface<T> {
public int them(T t);
public int capnhat(T t);
public int xoa(T t);

public ArrayList<T> selectAll();
public T selectById(T t);
public ArrayList<T> selectByCondition(String condition);

}
