<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,java.text.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student表的增刪改查界面</title>
</head>
<body>

<div style="width:500px;margin:0px auto;text-align:center">

<%--显示分页表的页面  --%> 
<table align='center' border='1' cellspacing='0'>
	<tr>
		<td>id</td>
		<td>qq</td>
		<td>name</td>
		<td>job</td>
		<td>创建时间</td>
		<td>更新时间</td>
		<td>编辑</td>
		<!-- <td>删除</td> -->
	</tr>
<c:forEach items="${list}" var="stu">


	<tr>
		<td>${stu.id}</td>
		<td>${stu.qq}</td>
		<td>${stu.name}</td>
		<td>${stu.job}</td>
		<td>${stu.create_at}</td>
		<td>${stu.update_at}</td>
		<td><a href="edit/${stu.id}">编辑</a></td>
		<%-- <td><a class="delete" href="Students/${stu.id}">删除</a></td> --%>
		<form action="Students/${stu.id}" method="post">
		<input type="hidden" value="DELETE" name="_method">
	刪除记录:	<input type="submit" value=${stu.id} >
		</form>
	</tr>
</c:forEach>
</table>
<%--翻页的设置--%> 

	<div style="text-align:center">
		<a href="Students?start=0">首页</a>
		<a href="Students?start=${page.start-page.step}">上一页</a>
		<a href="Students?start=${page.start+page.step}">下一页</a>
		<a href="Students?start=${page.last}">末页</a>
	</div>


	<div  style="text-align:center;margin-top:40px">
		<form action="Students" method="post">			
		qq:	<input type="text" name="qq" value=""><br>
		name:<input type="text" name="name" value=""><br>
		job:<input type="text" name="job" value=""><br>
			<input type="submit"  value="提交"><br>

		</form>
	</div>
	
		<div  style="text-align:center;margin-top:40px">
		<form action="Students" method="post">
		<input type="hidden" value="DELETE" name="_method">			
			<input type="submit"  value="删除所有记录"><br>

		</form>
	</div>
<br>
<br>
<br>
<br>
	
	</div>
		<div  style="text-align:center;margin-top:40px">
		<form action="Students/id" method="get" value=""><br><!-- get只能用参数传递 -->
		输入查询编号:<input type="text"  name="id">			
			<input type="submit"  value="查询对象"><br>

		</form>
	</div>
		
	
	
	
</div>
</body>
</html>