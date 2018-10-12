<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<h3>图片详情</h3>
<%-- 图片地址：<%="${works.picture}"%> --%>



	<div >
		<img src="${w.picture}"/>
	
	</div>
<br>
<br>
作品简介：${w.desc}
<br>

<h4>修改此作品</h4>
<div align="center">
	<form action="../works"   method="post">
	<input type="hidden" value="PUT" name="_method">
	<table border="1px">
	<tr>
		<td>作品名称</td>
		<td><input type="text" name="name" value="${w.name}"></td>
	</tr>
		<tr>
		<td>作品描述</td>
		<td><input type="text" name="desc" value="${w.desc}"></td>
	</tr>
		<tr>
		<td>作品图片路径</td>
		<td><input type="text" name="picture" value="${w.picture}"></td>
	</tr>
		<tr>
		<td>作品所属类别</td>
		<td ><input type="text" name="sid" value="${w.sid}"></td>
	</tr>
	
		
	<tr>
		<td><input type="hidden" name="wid" value="${w.wid}"></td>
		<td colspan="2"><input type="submit" value="修改提交"></td>
	</tr>


	</form>
</div>
<br>
<h4>刪除此作品</h4>

<div align="center">
	<form action="../works/${wid}"   method="post" align="center">
	<input type="hidden" value="DELETE" name="_method">
		<input type="hidden" name="wid" value="${w.wid}">
	<input type="submit" value="刪除操作">



	</form>
</div>
<br>


<a href="../index.jsp">返回主页</a>

</body>
</html>