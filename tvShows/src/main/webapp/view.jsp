<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TV Shows</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>
<style>
th,td{
border:solid;
}
</style>
<body>
<h1 algin="center">TV Details</h1>
	<ul class="nav justify-content-end">
		<li class="nav-item"><a class="nav-link active"
			aria-current="page" href="index.jsp">Home</a></li>
		<li class="nav-item"><a class="nav-link" href="form.jsp">Tv shows</a></li>
		<li class="nav-item"><a class="nav-link" href="#">Live Stream
				shows</a></li>
		<li class="nav-item"><a class="nav-link" href="#">View</a></li>

	</ul>
	
	<form action="Television" method="get">
	<input type="submit" value="click">
	<br>
	<br>
	<table border=1>
		<thead>
			<tr>
				<th>Show Title</th>
				<th>Language</th>
				<th>Reviews</th>
				<th>Ratings</th>
				<th>Available Date</th>
				<th>Created By</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="dto" items="${list}">
			<tr>
			   <td>${dto.title }</td>
				<td>${dto.language }</td>
				<td>${dto.reviews}</td>
				<td>${dto.ratings }</td>
				<td>${dto.availableOn }</td>
				<td>${dto.createdBy }</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</form>
</body>
</html>