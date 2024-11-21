<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container-md" >
	<form action="blink" method="post" >
	
		<div id="applyHelp" class="form-text">Enter the Product Details.</div>
		<br>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Product Name</label> 
			<input type="text" class="form-control"
				id="exampleInputPassword1" name="productName">
		</div>
		<br>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Product Brand</label> <input type="text" class="form-control"
				id="exampleInputPassword1" name="productBrand">
		</div>
		<br>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Product Price</label> <input type="text" class="form-control"
				id="exampleInputPassword1" name="productPrice">
		</div>
		<br>
		
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Product Quantity</label> <input type="text" class="form-control"
				id="exampleInputPassword1" name="productQuantity">
		</div>
		<br>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Product Ratings</label> <input type="text" class="form-control"
				id="exampleInputPassword1" name="productRatings">
		</div>
		<br>
		<input type="reset" class="btn btn-primary" value="reset">
		<input type="submit" class="btn btn-primary" value="Order">
</form>
</div>
</body>
</html>