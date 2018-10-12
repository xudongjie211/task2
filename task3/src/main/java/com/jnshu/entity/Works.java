package com.jnshu.entity;

public class Works {
	public int wid;
	public String name;
	public String desc;
	public String picture;
	public int sid;
	public int getWid() {
		return wid;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	public String toString(){
		return (wid+" 作品名称:"+name+"所属作品种类:"+sid+"图片路径"+picture);
	}
	
	
	
}
