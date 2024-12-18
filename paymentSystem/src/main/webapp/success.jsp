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
th, td {
	border: double 1px;
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
					<li class="nav-item"><a class="nav-link" href="#">Add</a></li>
					<li class="nav-item"><a class="nav-link" href="form.jsp">For
							Payment</a></li>
					<li class="nav-item"><a class="nav-link" href="view.jsp">View</a></li>


				</ul>
			</div>
		</div>
	</nav>

	<h2>Payment Details</h2>

	<table>
		<thead>
			<tr>
			    <th>Id</th>
				<th>Account Holder Name</th>
				<th>Payment Type</th>
				<th>Payment Amount</th>
				<th>From UPI</th>
				<th>To UPI</th>
				<th>Bank Name</th>
				<th>Created On</th>
				<th>Created By</th>
			</tr>
		</thead>

		<tbody>
			<tr>
			    <td>${payment.id }</td>
				<td>${payment.accountHolderName}</td>
				<td>${payment.paymentType}</td>
				<td>${payment.paymentAmount}</td>
				<td>${payment.fromUpi}</td>
				<td>${payment.toUpi}</td>
				<td>${payment.bankName}</td>
				<td>${payment.createdOn}</td>
				<td>${payment.createdBy}</td>
			</tr>
		</tbody>

	</table>


</body>

</html>