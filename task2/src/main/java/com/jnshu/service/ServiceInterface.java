package com.jnshu.service;

import java.util.ArrayList;

import com.jnshu.dao.pojo.Student;
import com.jnshu.util.Page;

public interface ServiceInterface {
	public long add(Student u);
	public boolean delete(long id);
	public boolean update(Student u);
	public Student selectOne(long id);
	public ArrayList<Student> select();
	public ArrayList<Student> selectLike(String name);
	public int count();
	public boolean deleteAll();
	public boolean back1();
	public ArrayList<Student> select5(Page page);
	
}
