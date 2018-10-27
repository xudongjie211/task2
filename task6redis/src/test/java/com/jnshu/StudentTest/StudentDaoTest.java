package com.jnshu.StudentTest;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jnshu.pojo.Course;
import com.jnshu.pojo.Student;
import com.jnshu.redisstudent.RedisStudent;
import com.jnshu.service.CourseInterface;
import com.jnshu.service.StudentInterface;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class StudentDaoTest {
	@Autowired
	private StudentInterface sd;
	@Autowired
	private RedisStudent rs;
	
//	@Test
//	public void addTest() {
//		long time=System.currentTimeMillis();
//		Student s=new Student();
//		s.setQq("895316178");
//		s.setName("白龙马");
//		s.setJob("QA");
//		s.setCreate_at(time);
//		s.setPassword("12345");
//		
//		
//		System.out.println(sd.add(s));
//		
//	}

//	@Test
//	public void selectLoginTest() {
//		Student s=new Student();
//		s.setName("白龙马");
//		s.setPassword("12345");
//		System.out.println(sd.selectLogin(s));
//		
//	}

	
//	@Test
//	public void findbynameTest() {
//		System.out.println(sd.findByname("白龙马"));
//		
//	}
	
	@Test
	public void findbynameTest() {
//		rs.addstringredis("name", "许东杰");
//		System.out.println(rs.getstringredis("name"));
//		List<Student> list=sd.select();
//		System.out.println(rs.addstringredis("allstudent", list));
//		list=(List<Student>)rs.getstringredis("allstudent");
//		System.out.println(list);
		
		//System.out.println(sd.count());
//		System.out.println(rs.getstringredis("num"));
	}
	
	
	
	
}
