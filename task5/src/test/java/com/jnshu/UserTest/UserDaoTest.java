//package com.jnshu.UserTest;
//
//import static org.junit.Assert.*;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.jnshu.pojo.User;
//import com.jnshu.service.UserInterface;
//
//
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:applicationContext.xml")
//public class UserDaoTest {
//	@Autowired
//	private UserInterface ui;
//	@Test
//	public void addtest() {
//		User u=new User();
//		u.setUsername("xudongjie");
//		u.setToken("token");
//		u.setSeries("series");
//		u.setLongtime(System.currentTimeMillis());
//		ui.add(u);
//		
//	}

	
//	@Test
//	public void findusertest() {
//		User u=new User();
//		
//		u.setUid(1);
//		System.out.println(ui.findUser(u).longtime);
//		
//	}
	
//	@Test
//	public void updateusertest() {
//		User u=new User();
//		
//		u.setUid(1);
//		u.setLongtime(System.currentTimeMillis());
//		System.out.println(ui.update(u));
//		
//	}
	
	
	
//}
