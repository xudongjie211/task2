package com.jnshu.service;


import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;


import com.jnshu.dao.JdbcInterface;
import com.jnshu.pojo.Student;



@Service
public class ServiceImpl implements ServiceInterface {
	private static ApplicationContext context=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	private static JdbcInterface jdbcinterface=context.getBean(JdbcInterface.class);
	@Override
	public long add(Student u) {
		jdbcinterface.add(u);
		return u.getId();
		
	}

	@Override
	public boolean delete(int id) {
	return	jdbcinterface.delete(id);
		
	}

	@Override
	public boolean update(Student u) {
	return jdbcinterface.update(u);
		
	}

	@Override
	public Student selectOne(int id) {
		
		return jdbcinterface.selectOne(id);
	}

	@Override
	public ArrayList<Student> select() {
		
		return jdbcinterface.select();
	}

	@Override
	public ArrayList<Student> selectLike(String name) {
		
		return jdbcinterface.selectLike(name);
	}

	@Override
	public int count() {
		
		return jdbcinterface.count();
	}

	@Override
	public boolean deleteAll() {
	return	jdbcinterface.deleteAll();
		
	}

	@Override
	public boolean back1() {
	return	jdbcinterface.back1();
		
	}

}

