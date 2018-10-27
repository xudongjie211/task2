package com.jnshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.jnshu.dao.StudentDao;
import com.jnshu.memcacheandredis.Memcachedstudent;
import com.jnshu.pojo.Student;



@Service
public class StudentImpl implements StudentInterface {
		private static ApplicationContext context=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		private static StudentDao sd=context.getBean(StudentDao.class);
		
		@Autowired
		private Memcachedstudent ms;
		
	@Override
	public long add(Student u) {
		long len=sd.add(u);
		List<Student> list=sd.select();
		ms.updateStudent(list);
		return len;
	}

	@Override
	public boolean delete(long id) {
		
		return sd.delete(id);
	}

	@Override
	public boolean update(Student u) {
		boolean b=sd.update(u);
		List<Student> list=sd.select();
		ms.updateStudent(list);		
		return b;
	}

	@Override
	public Student selectOne(long id) {
		
		return sd.selectOne(id);
	}

	@Override
	public List<Student> select() {
		if(ms.getStudent("allstudent")!=null){
			return (List<Student>)ms.getStudent("allstudent");
			
		}else {
		ms.setStudent("allstudent", sd.select());		
		return sd.select();
		}
	}

	@Override
	public List<Student> selectLike(String name) {
		// TODO Auto-generated method stub
		return sd.selectLike(name);
	}

	@Override
	public int count() {
		if(ms.getnum("num")!=null){
			return ms.getnum("num");
			
		}else{
			ms.setnum("num", sd.count());
		    return sd.count();
		}
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
