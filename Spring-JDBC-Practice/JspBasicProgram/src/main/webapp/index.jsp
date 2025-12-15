<%@page import="org.apache.jasper.tagplugins.jstl.core.Out"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>	
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% out.println("Hello I am using JspWriter built-in object out\n || \n"); %>
	<%! int x = 100; %>
	<%= "Value of x is : " %>
	<%= x %> 
	<h1>Hi, Gagan Sharma</h1>
	<% session.setAttribute("age", "100"); %>
	<form action="output.jsp" method="post">
		<input type="text" placeholder="Enter your name" name="name1"/>
		<input type="submit" value="Submit"/>
	</form>
</body>
</html>