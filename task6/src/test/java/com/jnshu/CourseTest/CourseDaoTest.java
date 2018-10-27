package com.jnshu.CourseTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jnshu.pojo.Course;
import com.jnshu.service.CourseInterface;





@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CourseDaoTest {
	@Autowired
	private CourseInterface cd;
	@Test
	public void addTest() {
		long time=System.currentTimeMillis();
		Course course=new Course();
		course.setCompanyCount("455");
		course.setCareerThreshold("sfsf");
		course.setCreate_at(time);
		course.setDifficulty("5");
		course.setFirstSalary("7000");
		course.setSecondSalary("9000");
		course.setThirdSalary("11000");
		course.setSkills("3");
		course.setCoursename("这是web前端课程");
		course.setIntro("web前端");
		course.setGrowth("5");
		
		System.out.println(course);
		System.out.println(cd.add(course));
		cd.select();
	}

}
