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
<body>
	<h3 align="center">Games Details</h3>
	<ul class="nav justify-content-end">
		<li class="nav-item"><a class="nav-link active"
			aria-current="page" href="index.jsp">Home</a></li>
		<li class="nav-item"><a class="nav-link" href="form.jsp">Details</a></li>
		<li class="nav-item"><a class="nav-link" href="#">Games</a></li>

	</ul>
	<form action="shows"  method="post" align="center">

		Enter the Game Name: <input type="text" placeholder="Game Name" name="gamename">
		 <br> <br>
		 Enter No of Players: <input type="number" placeholder="no of players" name="noOfPlayers">

		<br> <br>
		 Enter Minimum Age: <input type="number" placeholder="min age" name="minAge"> 
		 <br> <br>
		Enter price: <input type="text" placeholder="Price" name="price">
		<br> <br> 
		Enter Ratings: <input type="number" placeholder="Ratings" name="ratings"> <br> <br>
		 <br>
		  <input type="submit" class="btn btn-primary" value="submit">

	</form>


</body>
</html>