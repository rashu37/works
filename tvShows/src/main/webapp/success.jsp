<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
th, td {
	border: double 1px;
}
</style>

<body>
	<h1>TV Details</h1>
	<ul class="nav justify-content-end">
		<li class="nav-item"><a class="nav-link active"
			aria-current="page" href="index.jsp">Home</a></li>
		<li class="nav-item"><a class="nav-link" href="#">Tv shows</a></li>
		<li class="nav-item"><a class="nav-link" href="#">Live Stream
				shows</a></li>
		<li class="nav-item"><a class="nav-link" href="view.jsp">View</a></li>

	</ul>
	<table>
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
			<tr>
			   <td>${shows.title }</td>
				<td>${shows.language }</td>
				<td>${shows.reviews}</td>
				<td>${shows.ratings }</td>
				<td>${shows.availableOn }</td>
				<td>${shows.createdBy }</td>
			</tr>

		</tbody>
	</table>

</body>
</html>