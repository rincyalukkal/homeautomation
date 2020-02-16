<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="st" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Operations</title>
<style type="text/css">
table{border:1px solid grey;width:50%;}
table{    border: 1px solid #8BC34A;
    text-align: center;
    font-size: 20px;
}}
</style>
</head>
<body>
<h1> Devices</h1>
	
	
	
	<hr/>
	<table>
	<tr><th>Device Name</th> <th>Change Status</th></tr>
	<c:forEach items="${listd}" var="bean">
	<tr><td>${bean.dname}</td><td> <a href="onstatus?sl=${bean.didl}">Click to ON</a> || <a href="offstatus?sl=${bean.didl}">Click to OFF</a> </td></tr>
	
	
	
	</c:forEach>
	
	</table>
	<br/>
	<a href="home">Go back </a>
</body>
</html>