<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Blood Management</title>
<link rel="icon" type="image/x-icon"
	href="https://img.icons8.com/?size=80&id=9xygBPzKrg89&format=png">
</head>
<style>
.table {
	border-style: inset;
	border-color: rgb(230, 211, 211);
}
</style>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous"></link>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">


		<div class="container-fluid">
			<a class="navbar-brand" href="#">Logo</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="index.jsp">Home</a></li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="form.jsp">Details</a></li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">View</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<form action="save" method="get">
		<input type="submit" value="View">
	</form>
	<table class="table" align="center">
		<thead>

			<th>Sl.No</th>
			<th>Name</th>
			<th>Age</th>
			<th>Blood Group</th>
			<th>Action</th>
		</thead>
		<tbody>
			<c:forEach items="${listDto}" var="list">
				<tr>
					<td>${list.id}</td>
					<td>${list.name}</td>
					<td>${list.age}</td>
					<td>${list.group}</td>
					<td><a href="delete?id=${list.id}"><input type="button"
							class=btn-btn-danger value="Delete"> </a><a
						href="update?id=${list.id}"><input type="button"
							class=btn-btn-info value="update"></a></td>

				</tr>

			</c:forEach>
		</tbody>
	</table>

</body>
</html>