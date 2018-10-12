package com.jnshu.entity;

public class Sort {
	public int sid;
	public String name;
	public String desc;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
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
	public String toString(){
		return (sid+" 作品分类名称:"+name+" 详细内容"+desc);
	}
	
	
	
}
