package com.jnshu.dao.mapper;

import java.util.ArrayList;

import com.jnshu.dao.pojo.Student;
import com.jnshu.util.Page;



public interface JdbcInterface {
	//增删改的返回值可以使void,boolean（操作是否成功）,int（受影响行数）
	public long add(Student u);
	public boolean delete(long id);
	public boolean update(Student u);
	public Student selectOne(long id);
	public ArrayList<Student> select();//总表查询
	public ArrayList<Student> selectLike(String name);//模糊查询
	public int count();//记录条数
	public boolean deleteAll();
	public boolean back1();
	public ArrayList<Student> select5(Page page);
	
	
	
}
