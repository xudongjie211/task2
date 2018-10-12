package com.jnshu.controller;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jnshu.dao.JdbcInterface;
import com.jnshu.entity.Works;


@Controller
@RequestMapping("")
public class Sortcontroller {
	@Autowired
	private JdbcInterface jt;
	static Logger logger = Logger.getLogger(Sortcontroller.class);
	
//	@RequestMapping(value="/sorts/{sid}" ,method=RequestMethod.GET)
//	public ModelAndView selectWorks(@PathVariable int sid){
//		ModelAndView mac=new ModelAndView();
//		ArrayList<Works> list=jt.selectList(sid);
//		mac.addObject("list", list);	
//		
//		mac.setViewName("Workses");
//		System.out.println(list);
//		return mac;
//	}
	
	
	
}
