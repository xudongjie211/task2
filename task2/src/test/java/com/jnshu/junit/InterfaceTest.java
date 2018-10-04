package com.jnshu.junit;



import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jnshu.dao.mapper.JdbcInterface;
import com.jnshu.dao.pojo.Student;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class InterfaceTest {
	private  Student stu;	
	@Autowired
	private  JdbcInterface jt;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
			
		System.out.println("测试开始");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("测试结束");
		
	}

//	@Test
//	public void test() {
//		long time = System.currentTimeMillis();
//		stu=new Student();
//		stu.setQq("1131900758");
//		stu.setName("于一");
//		stu.setJob("java");
//		stu.setCreate_at(time);
//		stu.setUpdate_at(time);
//		
//		try{
//			jt.add(stu);
//			
//			
//		}catch(Exception e){
//			e.printStackTrace();		
//		}				
//	}	
	
	
//	@Test
//	public void test1() {				
//		
//			jt.back1();
//			System.out.println("测试开始");			
//	}
	
	
	@Test
	public void test3() {
		
		try{
			
//			ArrayList<Student> list=jt.select();
//			for(Student u:list){
//				
//				System.out.println(u.toString());
//			}
			
//			Student u=jt.selectOne(1);
//			System.out.println(u.toString());
			
			
//			ArrayList<Student> list=jt.selectLike("一");
//			for(Student u:list){
//				
//				System.out.println(u.toString());
//			}
			
//			int i=jt.count();
//			System.out.println("总共记录数量:"+i);
			
			long time = System.currentTimeMillis();
			Student u=new Student();
			int i=0;
			while(i<100){
				u.setQq("1131900758");
				u.setName("于一"+(i+1));
				u.setJob("java");
				u.setCreate_at(time);
				u.setUpdate_at(time);
				jt.add(u);
				i++;
			}
			
			
		}catch(Exception e){
			e.printStackTrace();		
		}				
	}
	
	
	

}
