package com.jnshu.service;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.jnshu.dao.CourseInterface;
import com.jnshu.pojo.Course;



@Service
public class Courseimpl implements Courseserviceinterface {
	private static ApplicationContext context=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	private static CourseInterface ci= context.getBean(CourseInterface.class);
	
	@Override
	public Course select(int id) {		
		return ci.select(id);
	}

	@Override
	public ArrayList<Course> selectAll() {		
		return ci.selectAll();
	}

	@Override
	public long add(Course course) {
		
		return ci.add(course);
	}

}
