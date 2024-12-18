<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
	<style>
	th,td{
	    border:double 1px;
	}</style>
</head>
<body>

	<ul class="nav justify-content-end">
		<li class="nav-item"><a class="nav-link active"
			aria-current="page" href="index.jsp">Home</a></li>
		<li class="nav-item"><a class="nav-link" href="form.jsp">Details</a></li>
		<li class="nav-item"><a class="nav-link" href="#">Games</a></li>
		<li class="nav-item"><a class="nav-link" href="#">View</a></li>
	</ul>

	<h2>Details About Games</h2>
	<h3>Read Successfully</h3>

	<form action="reading" method="get">
	<input type="submit" value="Click">
		
		<br><br>
		<table border=1>
			<thead>
				<tr>
					<th>Game Name</th>
					<th>No of Players</th>
					<th>Minimum Age</th>
					<th>Price</th>
					<th>Ratings</th>
					<th>Game Day</th>
					<th>Created By</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="view" items="${list}">
					<tr>
						<td>${view.gamename}</td>
						<td>${view.noOfPlayers}</td>
						<td>${view.minAge}</td>
						<td>${view.price}</td>
						<td>${view.ratings}</td>
						<td>${view.gameDay}</td>
						<td>${view.createdBy}</td>
					</tr>
				</c:forEach>
			</tbody>

		</table>
	</form>
</body>
</html>