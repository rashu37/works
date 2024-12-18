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
<!-- - <style>
body{
background-image: url("https://th.bing.com/th?id=OIP.fvh9USgM_tXt7ik1fJexnQHaFj&w=288&h=216&c=8&rs=1&qlt=90&o=6&dpr=1.3&pid=3.1&rm=2");
background-size: 100%;
}
</style> -->
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
					<li class="nav-item"><a class="nav-link" href="#">For
							Payment</a></li>

				</ul>
			</div>
		</div>
	</nav>
	<div class="container-sm">
		<form action="service" method="post">

			<div id="applyHelp" class="form-text">Enter Payment Details</div>
			<br>
			
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Account Holder Name</label> <input type="text" class="form-control"
					id="exampleInputPassword1" name="accountHolderName">
			</div>
			
			<div>
			<label>Payment Mode</label>
		 <select class="form-select form-select-sm mb-3"
				aria-label=".form-select-lg example" name="paymentType">
				<option selected>Select Payment Mode</option>
				<option value="Online">Online</option>
				<option value="Offline">Offline</option>
	     </select>
	     </div> 
		<!-- -- <div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Payment
					Mode</label> <input type="text" class="form-control"
					id="exampleInputPassword1" name="paymentType">
			</div>  -->	
			
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Payment
					Amount</label> <input type="text" class="form-control"
					id="exampleInputPassword1" name="paymentAmount">
			</div>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Enter
					From UPI Id </label> <input type="text" class="form-control"
					id="exampleInputPassword1" name="fromUpi">
			</div>

			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Enter
					To UPI Id</label> <input type="text" class="form-control"
					id="exampleInputPassword1" name="toUpi">
			</div>

			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Bank
					Name</label> <input type="text" class="form-control"
					id="exampleInputPassword1" name="bankName">
			</div>

			<div class="col-12">
				<div class="form-check">
					<input class="form-check-input" type="checkbox" value=""
						id="invalidCheck" required> <label
						class="form-check-label" for="invalidCheck"> Agree to
						terms and conditions </label>
					<div class="invalid-feedback">You must agree before
						submitting.</div>
				</div>
			</div>
			<br> <input type="submit" class="btn btn-success" value="Submit">
		</form>
	</div>
 
    <footer align="center">
    <div>Designed by: Rashmi</div>
    </footer>
    
 

</body>
</html>