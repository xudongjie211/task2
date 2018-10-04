<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>

<!-- 用taglib生成假数据 -->
<json:object>
<json:property name="name1" value="11"/>
<json:property name="name2" value="12"/>
<json:property name="name3" value="13"/>
</json:object>

<br>
<br>
<br>


<json:object>
<json:array name="Students">

<c:forEach items="${taglib}" var="c" >
<json:object>
<json:property name="id" value="${c.id}"/>
<json:property name="name" value="${c.name}"/>
<json:property name="job" value="${c.job}"/>
<br>
</json:object>


</c:forEach>
</json:array>
</json:object>
</body>
</html>