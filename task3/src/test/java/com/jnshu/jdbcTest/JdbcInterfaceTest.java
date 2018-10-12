package com.jnshu.jdbcTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jnshu.dao.JdbcInterface;
import com.jnshu.entity.Works;
import com.jnshu.util.Page;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcInterfaceTest {
	//private static Logger logger = Logger.getLogger(JdbcInterfaceTest.class);
	@Autowired
	private  JdbcInterface   jt;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
			
		System.out.println("测试开始");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("测试结束");
		
	}
	
	
	
	
//	@Test
//	public void testAddSort() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSelectSort() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testAddWorks() {
//		Works w=new Works();
//		w.setName("作品11");
//		w.setPicture("image.xudongjie.com/11.jpg");
//		int i=jt.addWorks(w);
//		System.out.println(i);
//	}

//	@Test
//	public void testSelectWorks() {
//		Works w=jt.selectWorks(1);
//		System.out.println(w.toString());
//	}
//
//	@Test
//	public void testSelectList() {
//		ArrayList<Works> list=jt.selectList(2);
//		System.out.println(list);
//	}
	
//	@Test
//	public void testupdateworks() {
//		Works w=new Works();
//		w.setWid(12);
//		w.setName("作品12");
//		w.setPicture("image.xudongjie.com/11.jpg");
//		w.setDesc("更新的描述");
//		w.setSid(1);
//		
//		boolean b=jt.updateWorks(w);
//		if(b){
//			System.out.println("更新成功");
//		}
//		else{
//			System.out.println("更新失敗");
//		}
//	}
	
//	@Test
//	public void testdeleteworks() {
//		boolean b=jt.deleteWorks(12);
//		if(b){
//			System.out.println("刪除成功");
//		}
//		else{
//			System.out.println("刪除失敗");
//		}
//	}
	
	@Test
	public void testselectpage() {
		Page page=new Page();
		int sid=1;
		ArrayList<Works> list=jt.selectpage(page,sid);
		System.out.println(list);
	}
	
	
	
}
