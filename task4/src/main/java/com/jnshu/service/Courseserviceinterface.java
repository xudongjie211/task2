package com.jnshu.service;


import java.util.ArrayList;

import com.jnshu.pojo.Course;


public interface Courseserviceinterface {
	public long add(Course course);
	public Course select(int id);
	public ArrayList<Course> selectAll();
}
