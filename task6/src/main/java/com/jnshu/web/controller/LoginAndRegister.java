package com.jnshu.web.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jnshu.logTest.Slf4jTest;
import com.jnshu.pojo.Student;
import com.jnshu.pojo.User;
import com.jnshu.service.CourseInterface;
import com.jnshu.service.StudentInterface;
import com.jnshu.service.UserInterface;
import com.jnshu.util.*;
@Controller
public class LoginAndRegister {
	@Autowired
	private StudentInterface si;
	@Autowired
	private CourseInterface ci;
	@Autowired
	private UserInterface ui;	
	
	private Logger logger = LoggerFactory.getLogger(LoginAndRegister.class);
	
	@RequestMapping(value="/register",method=RequestMethod.POST,produces = "application/json;charset=utf-8")
	@ResponseBody
	public String studentregister(Student stu,Model model,HttpServletResponse response){
		String name=stu.name;
		response.setContentType("text/html;charset=utf-8");
		if(si.findByname(name)!=null){
			return "名字已占用";
		}else{
			long time=System.currentTimeMillis();
			stu.setCreate_at(time);
			stu.setPassword(PasswordUtil.generate(stu.password));
			si.add(stu);
			
		return "注册成功";
		}
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST,produces = "application/json;charset=utf-8")

	public String student(Student st,Model model,HttpServletResponse response,HttpServletRequest request) throws Exception{
		logger.info("到达login业务类{}");
		Student stu=si.findByname(st.name);
		if (stu != null) {
			if (PasswordUtil.verify(st.password, stu.password)) {
				long time = System.currentTimeMillis();
				User u = new User();
				u.setUid(stu.id);			
				u.setLongtime(time);
				User use=ui.findUser(u);
				
				if(use!=null){
				
				String tk = TokenUtil.createToken(stu.id, time);
				CookieUtil.addCookie(response, "token", tk);
				ui.update(u);
				model.addAttribute("list", si.select());
				return "homepage";
				}else{
					String tk = TokenUtil.createToken(stu.id, time);
					CookieUtil.addCookie(response, "token", tk);
					ui.add(u);
					model.addAttribute("list", si.select());
					return "homepage";
					
				}
			} else {
				return "logindefault";

			}
		} else 
		{
			return "logindefault";

		}
	}
	
	
	
}
