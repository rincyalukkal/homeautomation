<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="st" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
table{border:1px solid grey;width:50%;}
table{    border: 1px solid #8BC34A;
    text-align: center;
    font-size: 20px;
}}
</style>
</head>
<body>
	<h1>List Of Devices</h1>
	
	
	
	<hr/>
	<table>
	<tr><th>Device Name</th></tr>
	<c:forEach items="${listd}" var="bean">
	<tr><td>${bean.dname}</td> <td><a href="deletedevice?sl=${bean.didl}">Click to delete</a></td></tr>
	
	
	</c:forEach>
	
	</table>
	<br/>
	<a href="home">Go back </a>
	
	
</body>
</html>






