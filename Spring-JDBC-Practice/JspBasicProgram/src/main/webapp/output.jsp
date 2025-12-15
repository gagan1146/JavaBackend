<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%= "I am in Output.jsp Page" %>
	<h1></h1>
	<% 
		String myname = request.getParameter("name1");
		String x = (String) session.getAttribute("age");
	%>
	<h1><%= "Name get from request object is :- " + myname %></h1>
	<h1><%= "Name get from session object is :- " + x %></h1>
</body>
</html>