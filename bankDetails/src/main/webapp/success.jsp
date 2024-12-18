<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
th, td {
	border: solid 1px;
}
</style>
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
						aria-current="page" href="#">Home</a></li>
					
					<li class="nav-item"><a class="nav-link" href="form.jsp">Details</a>
					</li>
					
					<li class="nav-item"><a class="nav-link" href="view.jsp">View</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="search.jsp">Search</a>
					</li>
	
	
				</ul>
			</div>
		</div>
	</nav>
	<h4>Bank Details</h4>
	<table>
		<thead>
			<tr>
				<th>Account Number</th>
				<th>Account Holder Name</th>
				<th>Account Type</th>
				<th>Bank Balance</th>
				<th>Created On</th>
				<th>Created By</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${details.accountNumber }</td>
				<td>${details.accountHolderName }</td>
				<td>${details. accountType}</td>
				<td>${details.balance }</td>
				<td>${details.createdOn }</td>
				<td>${details.createdBy }</td>
			</tr>
		</tbody>
	</table>

</body>
</html>