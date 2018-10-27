package com.jnshu.memcacheandredis;
import java.util.List;
import java.util.concurrent.TimeoutException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.jnshu.pojo.Student;
import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.exception.MemcachedException;


@Component
public class Memcachedstudent {
	@Autowired
	private MemcachedClient mc;
	
	public void setStudent(String key,List<Student> list){
		try {
			mc.set(key, 0, list);
		} catch (Exception e) {			
			e.printStackTrace();
		} 
		
		
		
	}
	public void updateStudent(List<Student> list){
		try {
			mc.set("allstudent", 0, list);
		} catch (Exception e) {			
			e.printStackTrace();
		} 
		
		
		
	}
	public List<Student> getStudent(String key) {
		List<Student> list=null;
		try {
			list = (List<Student>)mc.get(key);
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (MemcachedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return list;
	
		
	}
	
	
	public void deletekey(String key){		
		try {
			mc.delete(key);
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MemcachedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	public void setnum(String key,int num){
		try {
			mc.set(key, 0, num);
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MemcachedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void updatenum(int num){
		try {
			mc.set("num", 0, num);
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MemcachedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Integer getnum(String key) {
		Integer num=null;
		try {
			num = mc.get(key);
			
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MemcachedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
		
	}
	
	
	
}
