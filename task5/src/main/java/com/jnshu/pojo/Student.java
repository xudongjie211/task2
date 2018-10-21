package com.jnshu.pojo;

public class Student {
	public long id;//自增
	public String qq;
	public String name;
	public String job;//修真类型
	public String comeTime;
	public String school;
	public long studyNum;//学号
	public String daily;//日报链接
	public String hope;//立愿
	public String teacher;//师兄
	public String whereKnow;
	public long create_at;
	public long update_at;
	public String password;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getComeTime() {
		return comeTime;
	}
	public void setComeTime(String comeTime) {
		this.comeTime = comeTime;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public long getStudyNum() {
		return studyNum;
	}
	public void setStudyNum(long studyNum) {
		this.studyNum = studyNum;
	}
	public String getDaily() {
		return daily;
	}
	public void setDaily(String daily) {
		this.daily = daily;
	}
	public String getHope() {
		return hope;
	}
	public void setHope(String hope) {
		this.hope = hope;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getWhereKnow() {
		return whereKnow;
	}
	public void setWhereKnow(String whereKnow) {
		this.whereKnow = whereKnow;
	}

	
	public long getCreate_at() {
		return create_at;
	}
	public void setCreate_at(long create_at) {
		this.create_at = create_at;
	}
	public long getUpdate_at() {
		return update_at;
	}
	public void setUpdate_at(long update_at) {
		this.update_at = update_at;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString(){
		return ("[ID:"+id+" 姓名："+name+" qq:"+qq+" 修真类型："+job+" 学校："+school+"]");
		
	}
	
	
}