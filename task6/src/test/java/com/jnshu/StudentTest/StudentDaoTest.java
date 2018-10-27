package com.jnshu.StudentTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jnshu.memcacheandredis.Memcachedstudent;
import com.jnshu.pojo.Course;
import com.jnshu.pojo.Student;
import com.jnshu.service.CourseInterface;
import com.jnshu.service.StudentInterface;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class StudentDaoTest {
	@Autowired
	private StudentInterface sd;
	@Autowired
	private Memcachedstudent ms;

	@Test
	public void addTest() {
		long time=System.currentTimeMillis();
		Student s=new Student();
		s.setQq("89366451618");
		s.setName("蜘蛛精");
		s.setJob("ceo");
		s.setCreate_at(time);
		s.setPassword("1234979");
		sd.add(s);
		System.out.println(ms.getStudent("allstudent"));
		
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
		System.out.println(sd.findByname("白龙马"));
		
	}
}
