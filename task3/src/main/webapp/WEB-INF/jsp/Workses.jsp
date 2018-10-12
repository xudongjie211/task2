<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" %>

 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h3>架上绘画.装置</h3>

<div align="center">

	<c:forEach items="${list}" var="work">


		<div>
			<a href="../works/${work.wid}">
			<img src="${work.picture}" />
			</a>
		</div>
		<br>
		<br>
作品简介：${work.desc}
<br>
		<a href="../index.jsp">返回主页</a>
	</c:forEach>
	
	</div>
<br>
<br>
<br>
<br>	
<br>
<br>	
<br>
<br>

	<div style="text-align:center">
		<a href="/task3/sorts/${sid}?start=0">首页</a>
		<a href="/task3/sorts/${sid}?start=${page.start-page.step}">上一页</a>
		<a href="/task3/sorts/${sid}?start=${page.start+page.step}">下一页</a>
		<a href="/task3/sorts/${sid}?start=${page.last}">末页</a>
	</div>



<br>
<br>
<br>	
<br>
<br>	
<br>
<br>


<h4>增加作品列表</h4>


<div>
<form action="../works" method="post" >
	<table border="1px" align="center">
	<tr>
		<td>作品名称</td>
		<td><input type="text" name="name" value=""></td>
	</tr>
		<tr>
		<td>作品描述</td>
		<td><input type="text" name="desc" value=""></td>
	</tr>
		<tr>
		<td>作品图片路径</td>
		<td><input type="text" name="picture" value=""></td>
	</tr>
		<tr>
		<td>作品所属类别</td>
		<td ><input type="text" name="sid" value="${sid}"></td>
	</tr>
		
	<tr>
	
		<td colspan="2"><input type="submit" value="提交"></td>
	</tr>
	
	
	</table>
</form>
</div>	
	
	
	
</body>
</html>