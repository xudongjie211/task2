package com.jnshu.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jnshu.dao.mapper.JdbcInterface;
import com.jnshu.dao.pojo.Student;
import com.jnshu.service.ServiceImpl;
import com.jnshu.service.ServiceInterface;
import com.jnshu.util.Page;


@Controller
@RequestMapping("")
public class CrudController {
	private static Logger logger = Logger.getLogger("CrudController.class");
	@Autowired
	private ServiceImpl jt;
	
	
	@RequestMapping(value="/Students" ,method=RequestMethod.GET)
	public ModelAndView selectAll(Page page){
		//System.out.println(page.start+"aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		int sum=jt.count();
		page.calculate(sum);
		
		if(page.start>=page.last){
			page.start=page.last ;
		}
		
		ModelAndView mac=new ModelAndView();
		ArrayList<Student> list=jt.select5(page);		
		mac.addObject("list", list);
		//System.out.println(list);
		mac.setViewName("Student");
		return mac;
	}
	
	
	@RequestMapping(value="/Students",method=RequestMethod.POST)
	public ModelAndView addStuent(Student stu){
		if(stu!=null){
			
			ModelAndView mav=new ModelAndView();
			long time = System.currentTimeMillis();
			stu.setCreate_at(time);
			jt.add(stu);		
			mav.setViewName("redirect:/Students");
			return mav;
		
		}else{
			return null;
		}
	}
	
	
	@RequestMapping(value="/Students/{id}",method=RequestMethod.DELETE)
	public ModelAndView deletestudetn(@PathVariable("id") long id){//路径中的变量  @requestparam是请求的参数
		//ModelAndView mav=new ModelAndView();
		jt.delete(id);
		//mav.setViewName("redirect:/Students");
		ModelAndView mav = new ModelAndView("redirect:/Students");
		//System.out.println("到达post成了 ");
		return mav;
	}
	
	
	@RequestMapping(value="/Students",method=RequestMethod.DELETE)
	public ModelAndView deleteAll(){//路径中的变量  @requestparam是请求的参数
		//ModelAndView mav=new ModelAndView();
		jt.back1();
		//mav.setViewName("redirect:/Students");
		ModelAndView mav = new ModelAndView("redirect:/Students");
		
		return mav;
	}

	
	@RequestMapping(value="/edit/{id}")
	public ModelAndView edit(@PathVariable("id") long id){//路径中的变量  @requestparam是请求的参数
		ModelAndView mav=new ModelAndView();
		Student stu=jt.selectOne(id);
		mav.addObject("stu", stu);
		mav.setViewName("edit");
		//System.out.println("到达post成了 啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊");
		return mav;
	}
	
	
	@RequestMapping(value="/Students/{id}",method=RequestMethod.PUT)
	public ModelAndView update(@PathVariable("id") long id, Student stu){//路径中的变量  @requestparam是请求的参数
		ModelAndView mav=new ModelAndView();
		long time = System.currentTimeMillis();
		stu.setUpdate_at(time);
		jt.update(stu);
		mav.setViewName("redirect:/Students");
		//System.out.println("到达post成了 啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊");
		return mav;
	}
	
	@ResponseBody
	@RequestMapping(value="/Students/id",method=RequestMethod.GET)
	public String selectone(@RequestParam long id,HttpServletResponse response){//路径中的变量  @requestparam是请求的参数@RequestParam  long id
		/*{}占位符，前后一致*/
	//response.setCharacterEncoding("utf-8");
		logger.info("选择编号"+id);
		Student stu=jt.selectOne(id);
		if(stu!=null){
		return stu.toString();
		}else{
			return "没有结果";
			
		}
		
	}
	//测试注释@ResponseBody传输json数据到新页面
	@ResponseBody
	@RequestMapping("/getStudents")
	public ArrayList<Student> getStudents(){
		ArrayList<Student> list=new ArrayList<Student>();
			list=jt.select();
		return list;
	
	}
	//用taglib的标签来接受json数据
	@ResponseBody
	@RequestMapping("/taglibtest")
	public ModelAndView taglibTest(){
		ModelAndView mav=new ModelAndView();
		
		ArrayList<Student> list=jt.select();
		mav.addObject("taglib", list);
		list=jt.select();
		mav.setViewName("jsontaglib");
		return mav;
	
	}	
	
	
}
