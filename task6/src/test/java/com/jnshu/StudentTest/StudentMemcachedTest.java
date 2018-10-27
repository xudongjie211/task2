package com.jnshu.StudentTest;

import java.util.List;
import java.util.concurrent.TimeoutException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jnshu.memcacheandredis.Memcachedstudent;
import com.jnshu.pojo.Student;
import com.jnshu.service.StudentInterface;

import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.exception.MemcachedException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class StudentMemcachedTest {
	@Autowired
	private StudentInterface si;
	@Autowired
	private MemcachedClient mc;
	@Autowired
	private Memcachedstudent ms;
	
	@Test
	public void allstudentTest() {
		List<Student> list=si.select();
		System.out.println(list);
//		try {
//			mc.set("allstudent", 0, list);
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//		}
		
		
//		try {
//			List<Student> name=mc.get("allstudent");
//			System.out.println(name);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
		
		
//		List<Student> list=ms.getStudent("allstudent");
//		System.out.println(list);
		

//		System.out.println(si.count());
		
	}
	
	
}
