package com.jnshu.pojo;

import java.math.BigDecimal;

public class Course {
	public long id;
	public String coursename;
	public String intro;
	public  BigDecimal salary;
	public int studynum;
	public long create_at;
	
	public long getCreate_at() {
		return create_at;
	}


	public void setCreate_at(long create_at) {
		this.create_at = create_at;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getCoursename() {
		return coursename;
	}


	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}


	public String getIntro() {
		return intro;
	}


	public void setIntro(String intro) {
		this.intro = intro;
	}


	public BigDecimal getSalary() {
		return salary;
	}


	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}


	public int getStudynum() {
		return studynum;
	}


	public void setStudynum(int studynum) {
		this.studynum = studynum;
	}


	@Override
	public String toString() {
		String zfc="[id:"+id+"职业名称:"+coursename+"介绍:"+intro+"收入:"+salary+"在学人数:"+studynum+"]";
		return zfc;
	}
	
	

}
