package com.jnshu;

import com.jnshu.dao.StudentDao;
import com.jnshu.dao.UserDao;
import com.jnshu.pojo.Student;
import com.jnshu.redisstudent.RedisStudent;
import com.jnshu.service.StudentInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class StudentDaoTest {
	@Autowired
	private StudentDao sd;
	@Autowired
	private RedisStudent rs;
	@Autowired
	private UserDao ui;
	
	
	@Test
	public void addTest() {
		long time=System.currentTimeMillis();
		Student s=new Student();
		s.setQq("895316178");
		s.setName("ew");
		s.setJob("QA");
		s.setCreate_at(time);
		s.setPassword("12345");
		s.setPhone("15721241663");
		s.setEmail("1131900758@qq.com");
		s.setStatus("0");
		System.out.println(sd.add(s));


	}

//	@Test
//	public void selectLoginTest() {
//		Student s=new Student();
//		s.setName("白龙马");
//		s.setPassword("12345");
//		System.out.println(sd.selectLogin(s));
//		
//	}

	
	@Test
	public void findbynameTest() {
		System.out.println(sd.select());

	}
	
//	@Test
//	public void findbynameTest() {
//		System.out.println(sd.back1());
		
		
		
//		rs.addstringredis("name", "许东杰");
//		System.out.println(rs.getstringredis("name"));
//		List<Student> list=sd.select();
//		System.out.println(rs.addstringredis("allstudent", list));
//		list=(List<Student>)rs.getstringredis("allstudent");
//		System.out.println(list);
		
		//System.out.println(sd.count());
//		System.out.println(rs.getstringredis("num"));
//	}
	
	
	
	
}
