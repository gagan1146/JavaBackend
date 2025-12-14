<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
</head>
<body>
	<a href = "profile.jsp">Profile</a> &nbsp; &nbsp;
	<a href = "home.jsp">Home</a> &nbsp; &nbsp;
	<a href = "login.jsp">Login</a> &nbsp; &nbsp;
	<a href = "about.jsp">About</a> &nbsp; &nbsp;
    <%
        String myname = (String) session.getAttribute("name1");
    %>

    <h2>Welcome to profile page, <%= myname %></h2>
</body>
</html>
