package com.jnshu.dao;


import java.util.ArrayList;

import com.jnshu.pojo.Course;


public interface CourseInterface {
	public long add(Course course);
	public Course select(int id);
	public ArrayList<Course> selectAll();
}
