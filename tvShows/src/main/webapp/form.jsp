<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
</head>
<style>
body {
	background-color: grey;
}
</style>
<body>
	<h3 align="center">Tv Shows Details</h3>
	<ul class="nav justify-content-end">
		<li class="nav-item"><a class="nav-link active"
			aria-current="page" href="index.jsp">Home</a></li>
		<li class="nav-item"><a class="nav-link" href="form.jsp">Tv
				shows</a></li>
		<li class="nav-item"><a class="nav-link" href="#">Live Stream
				shows</a></li>

	</ul>
     <form action="Tv"  method="post" align="center">

		Enter the Show Title: <input type="tel" placeholder="Title"
			name="title"> <br> <br> Select Show Language: <select
			name="language">
			<option selected>select language</option>
			<option value="Kannada">Kannada</option>
			<option value="English">English</option>
			<option value="Telagu">Telagu</option>
			<option value="Malyalam">Malyalam</option>
		</select> <br> <br> Enter Available Date: <input type="date"
			placeholder="Date" name="availableOn"> <br> <br>
		Enter Reviews: <input type="number" placeholder="Reviews"
			name="reviews"> <br> <br> Enter Ratings: <input
			type="number" placeholder="Ratings" name="ratings"> <br>
		<br>
		 <input type="submit" class="btn btn-primary" value="submit">

	</form>

</body>
</html>