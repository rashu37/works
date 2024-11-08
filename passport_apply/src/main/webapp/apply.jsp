<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Apply</title>
</head>
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
	body{
	height:44X;
	margin:0;
	}
	footer{
	background=color:grey;
	text-algin: center;
	justify-content: center;
	}
	</style>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">


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
						aria-current="page" href="#">Apply</a></li>
                 </ul>
			</div>
		</div>
	</nav>
	<div class="container-md">
	<form action="register" method="get">
	
		<div id="applyHelp" class="form-text">Register Your Details.</div>
		<br>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Your Name</label> <input type="text" class="form-control"
				id="exampleInputPassword1" name="yourName">
		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Contact Number</label> <input type="text" class="form-control"
				id="exampleInputPassword1" name="contactNumber">
		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Email Address</label> <input type="text" class="form-control"
				id="exampleInputPassword1" name="emailAddress">
		</div>
		
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Your Father Name</label> <input type="text" class="form-control"
				id="exampleInputPassword1" name="yourFatherName">
		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Your Mother Name</label> <input type="text" class="form-control"
				id="exampleInputPassword1" name="yourMotherName">
		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Current Address</label>
			<input type="text" class="form-control" id="exampleInputPassword1"
				name="currentAddress">
		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Permanent Address</label>
			<input type="text" class="form-control" id="exampleInputPassword1"
				name="permanentAddress">
		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Highest Qualification</label>
			<input type="text" class="form-control" id="exampleInputPassword1"
				name="highestQualification">
		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Adhar Number</label> <input type="text" class="form-control"
				id="exampleInputPassword1" name="adharNumber">
		</div>
		<input type="submit" class="btn btn-primary" value="Apply">
	</form>
</div>
<footer class="footer">
    <div>Designed by: Rashmi</div>
    </footer>

</body>
</html>