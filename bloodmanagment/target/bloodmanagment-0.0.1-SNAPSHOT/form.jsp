<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="container-md">
	<form action="blood" method="post">
	
		<div id="applyHelp" class="form-text">Enter Your Details.</div>
		<br>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Your Name</label> <input type="text" class="form-control"
				id="exampleInputPassword1" name="yourName">
		</div>
		<br>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Your Age</label> <input type="tel" class="form-control"
				id="exampleInputPassword1" name="yourAge">
		</div>
		<br>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Blood Group</label> <input type="text" class="form-control"
				id="exampleInputPassword1" name="bloodGroup">
		</div>
		
		<br>
		<input type="reset" class="btn btn-primary" value="reset">
		<input type="submit" class="btn btn-primary" value="Apply">
		</form>
		</div>

</body>
</html>