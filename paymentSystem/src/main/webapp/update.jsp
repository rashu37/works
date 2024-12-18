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
<body>

<div class="container-sm">
		<form action="update" method="post">

			<div id="applyHelp" class="form-text">Update Your Payment Details</div>
			<br>
			
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Id</label> <input type="hidden" class="form-control"
					id="exampleInputPassword1" name="id" value="${dto.id}">
			</div>
			
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Id</label> <input type="hidden" class="form-control"
					id="exampleInputPassword1" name="id" value="${dto.accountNumber}">
			</div>
			
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Account Holder Name</label> <input type="text" class="form-control"
					id="exampleInputPassword1" name="accountHolderName" value="${dto.accountHolderName}">
			</div>
			
			<div>
			<label>Payment Mode</label>
		 <select class="form-select form-select-sm mb-3"
				aria-label=".form-select-lg example" name="paymentType" value="${dto.paymentType}">
				<option selected>Select Payment Mode</option>
				<option value="Online">Online</option>
				<option value="Offline">Offline</option>
	     </select>
	     </div> 
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Payment
					Amount</label> <input type="text" class="form-control"
					id="exampleInputPassword1" name="paymentAmount" value="${dto.paymentAmount}">
			</div>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Enter
					From UPI Id </label> <input type="text" class="form-control"
					id="exampleInputPassword1" name="fromUpi" value="${dto.fromUpi}">
			</div>

			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Enter
					To UPI Id</label> <input type="text" class="form-control"
					id="exampleInputPassword1" name="toUpi"  value="${dto.toUpi}">
			</div>

			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Bank
					Name</label> <input type="text" class="form-control"
					id="exampleInputPassword1" name="bankName"  value="${dto.bankName}">
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
			<br> <input type="submit" value="update">
		</form>
	</div>

</body>
</html>