<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Blood Management</title>
<link rel="icon" type="image/x-icon"
	href="https://img.icons8.com/?size=80&id=9xygBPzKrg89&format=png">
</head>
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
						aria-current="page" href="#">Details</a></li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="view.jsp">View</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container-md">
		<form action="blood" method="post">

			<div id="applyHelp" class="form-text">Enter Your Details.</div>
			<br>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Your
					Name</label> <input type="text" class="form-control"
					id="exampleInputPassword1" name="yourName">
			</div>
			<br>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Your
					Age</label> <input type="tel" class="form-control"
					id="exampleInputPassword1" name="yourAge">
			</div>
			<br>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Blood
					Group</label> <input type="text" class="form-control"
					id="exampleInputPassword1" name="bloodGroup">
			</div>

			<br> <input type="reset" class="btn btn-primary" value="reset">
			<input type="submit" class="btn btn-primary" value="Apply">
		</form>
	</div>

</body>
</html>