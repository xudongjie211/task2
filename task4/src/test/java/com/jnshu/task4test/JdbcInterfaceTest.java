package com.jnshu.task4test;


import java.math.BigDecimal;
import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jnshu.pojo.Course;
import com.jnshu.pojo.Student;
import com.jnshu.service.Courseserviceinterface;

import com.jnshu.service.ServiceInterface;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcInterfaceTest {
	@Autowired
	private ServiceInterface jt;
	@Autowired
	private Courseserviceinterface  cs;
//	@Test
//	public void testAdd() {
//		long time = System.currentTimeMillis();
//		Student stu=new Student();
//		stu.setName("师傅");
//		stu.setCreate_at(time);
//		stu.setJob("java");
//		stu.setQq("46516565");
//		jt.add(stu);
//		
//		
//		
//	}
//	public void testAddcourse() {
//		long time = System.currentTimeMillis();
//		Course course=new Course();
//		course.setCoursename("web前端");
//		course.setIntro("这是前端的课程");
//		course.setSalary(new BigDecimal(12000));;
//		course.setStudynum(38);
//		course.setCreate_at(time);
//		cs.add(course);
//	}
//	
//	
	
//
//	@Test
//	public void testDelete() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testUpdate() {
//		fail("Not yet implemented");
//	}

//	@Test
//	public void testSelectOne() {
//		Student stu=jt.selectOne(1);
//		System.out.println(stu);
//	}
//
	@Test
	public void testSelect() {
		System.out.println(jt.select());;
	}
//
//	@Test
//	public void testSelectLike() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testCount() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testDeleteAll() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testBack1() {
//		 jt.back1();
//	}

//	@Test
//	public void testcourseSelect() {
//		ArrayList<Course> list=cs.selectAll();
//		for(Course course:list){
//			System.out.println(course);
//			
//		}
//		
//	}
	
	
}
