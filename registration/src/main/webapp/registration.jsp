<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
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
    <%@include file= "navbar.jsp"%>

<form action="register" align ="center" method = "get">
  <h1>Register here</h1>
   <input type="text" placeholder="enter name" name="userName"><br><br>
      <input type="email" placeholder="enter email" name="userEmail"><br><br>
      <input type="tel" placeholder="enter conatct number" name="contactNumber"><br><br>
      <input type="password" placeholder="enter password" name="password"><br><br>

    <input type="submit" class="btn btn-primary" value="register">  

</form>

</body>
</html>