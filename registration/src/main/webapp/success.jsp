<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <%@include file= "navbar.jsp"%>

	<div align="center">
		<h1>Registration done</h1>
		<p>User details</p>
		<p>user name: ${name}</p>
		<input type="text" value="${name}">
	</div>
</body>
</html>