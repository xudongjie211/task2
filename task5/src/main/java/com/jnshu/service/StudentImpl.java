package com.jnshu.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.jnshu.dao.StudentDao;
import com.jnshu.pojo.Student;



@Service
public class StudentImpl implements StudentInterface {
		private static ApplicationContext context=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		private static StudentDao sd=context.getBean(StudentDao.class);
	@Override
	public long add(Student u) {
		// TODO Auto-generated method stub
		return sd.add(u);
	}

	@Override
	public boolean delete(long id) {
		// TODO Auto-generated method stub
		return sd.delete(id);
	}

	@Override
	public boolean update(Student u) {
		// TODO Auto-generated method stub
		return sd.update(u);
	}

	@Override
	public Student selectOne(long id) {
		// TODO Auto-generated method stub
		return sd.selectOne(id);
	}

	@Override
	public List<Student> select() {
		// TODO Auto-generated method stub
		return sd.select();
	}

	@Override
	public List<Student> selectLike(String name) {
		// TODO Auto-generated method stub
		return sd.selectLike(name);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return sd.count();
	}

	@Override
	public boolean deleteAll() {
		// TODO Auto-generated method stub
		return sd.deleteAll();
	}

	@Override
	public boolean back1() {
		// TODO Auto-generated method stub
		return sd.back1();
	}

	@Override
	public Student selectLogin(Student u) {
		// TODO Auto-generated method stub
		return sd.selectLogin(u);
	}

	@Override
	public Student findByname(String name) {
		// TODO Auto-generated method stub
		return sd.findByname(name);
	}

}
