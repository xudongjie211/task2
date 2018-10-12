package com.jnshu.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jnshu.dao.JdbcInterface;
import com.jnshu.entity.Works;
import com.jnshu.util.Page;


@Controller
@RequestMapping("")
public class Workscontroller {
	@Autowired
	private JdbcInterface jt;	
	static Logger logger = Logger.getLogger(Workscontroller.class);
	
	//查看单个作品的图片及信息
	@RequestMapping(value="/works/{wid}" ,method=RequestMethod.GET)
	public ModelAndView selectWorks(@PathVariable int wid){
		ModelAndView mac=new ModelAndView();
		Works w=jt.selectWorks(wid);
		mac.addObject("w", w);	
		//System.out.println(w.toString());
		mac.setViewName("Works");
		return mac;
	}
	//查询不同分类作品，增加分页功能
	
	@RequestMapping(value="/sorts/{sid}" ,method=RequestMethod.GET)
	public ModelAndView selectList(@PathVariable int sid,Page page){
		ModelAndView mac=new ModelAndView();
		//System.out.println(sid);
		int sum=jt.countworks(sid);
		page.calculate(sum);
		ArrayList<Works> list=jt.selectpage(page, sid);		
		//ArrayList<Works> list=jt.selectList(sid);
		mac.addObject("list", list);
		mac.addObject("sid", sid);
		mac.setViewName("Workses");
		//System.out.println(list);
		return mac;
	}
	
	
	
	
	
	
	//添加作品
	@RequestMapping(value="/works" ,method=RequestMethod.POST,produces = "application/json;charset=utf-8")
	@ResponseBody
	public String addWorks(HttpServletRequest request,Works w){
//		Works w=new Works();
//		w.setName(request.getParameter("name"));
//		w.setPicture(request.getParameter("picture"));
		
		//w.setSid(Integer.parseInt(request.getParameter("sid")));
		//System.out.println(w.toString());		
		int i=jt.addWorks(w);
		if(i>=0){
			return "添加成功";
			
		}else{
			
			return "添加失败";
		}
		

	}
	
	@RequestMapping(value = "/works", method = RequestMethod.PUT,produces = "application/json;charset=utf-8")
	@ResponseBody
	public String updateWorks(Works w, HttpServletResponse response) {
	
		System.out.println(w.toString());
		boolean b = jt.updateWorks(w);
		if (b) {
			return "更新成功";
		} else {
			return "更新失敗";
		}
	}
	
	@RequestMapping(value = "/works/{wid}", method = RequestMethod.DELETE,produces = "application/json;charset=utf-8")
	@ResponseBody
	public String deleteWorks(@PathVariable int wid) {
		System.out.println(wid);
		boolean b = jt.deleteWorks(wid);
		if (b) {
			return "刪除成功";
		} else {
			return "刪除 失敗";
		}

	}
	
	
	
	
}
