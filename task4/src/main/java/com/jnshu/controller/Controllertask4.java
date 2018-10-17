package com.jnshu.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jnshu.pojo.Course;
import com.jnshu.pojo.Student;
import com.jnshu.service.Courseserviceinterface;
import com.jnshu.service.ServiceInterface;

@Controller
@RequestMapping("")
public class Controllertask4 {
	@Autowired
	private ServiceInterface jt;
	@Autowired
	private Courseserviceinterface cs;	
	
	static Logger logger = Logger.getLogger(Controllertask4.class);
	
	
//	@RequestMapping(value="/index")
//	public ModelAndView index(Model model) {
//		Map<String,Student> stu=new HashMap<String,Student>();
//		stu.put("stu", jt.selectOne(1));	
//	return new ModelAndView("myView",stu);
//	}
	
	@RequestMapping(value="/index")
	public ModelAndView index(Model model) {	
		ArrayList<Student> list=jt.select();
		Map<String,ArrayList<Student>> map=new HashMap<String,ArrayList<Student>>();
		map.put("list", list);
		
	return new ModelAndView("myView3",map);
	}
	
	@RequestMapping(value="/job")
	public ModelAndView job(Model model) {	
		ArrayList<Course> courses=cs.selectAll();
		Map<String,ArrayList<Course>> map=new HashMap<String,ArrayList<Course>>();
		map.put("courses", courses);
		
	return new ModelAndView("myView1",map);//转到职业页面
	}
	
	
}
