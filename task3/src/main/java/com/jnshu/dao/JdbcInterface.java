package com.jnshu.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.jnshu.entity.Sort;
import com.jnshu.entity.Works;
import com.jnshu.util.Page;

public interface JdbcInterface {
	public int addSort(Sort s);
	public Boolean deleteSort(int sid);
	public Boolean updateSort(Sort s);
	public Sort selectSort(int sid);
	public ArrayList<Sort> selects();
	
	public int addWorks(Works w);
	public Boolean deleteWorks(int wid);
	public Boolean updateWorks(Works w);
	public Works selectWorks(int wid);
	public ArrayList<Works> selectw();
	
	public ArrayList<Works> selectList(int sid);
	
	public ArrayList<Works> selectpage(@Param("page") Page page,@Param("sid") int sid);
	public int countworks(int sid);
	
	
	
}
