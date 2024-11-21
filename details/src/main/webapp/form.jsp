<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
<div class="container-md" >
	<form action="details" method="get" >
	
		<div id="applyHelp" class="form-text">Register Your Details.</div>
		<br>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Your Name</label> <input type="text" class="form-control"
				id="exampleInputPassword1" name="yourName">
		</div>
		<br>
		
		
		<div class="mb-3">
		  <label for="exampleInputPassword1" class="form-lable">Date of Birth</label> <input type="date" class="form-control" 
		  id="exampleInputPassword1" name="dob">
		</div>
		<br>
		
		<div class="mb-3">
		   <label for="exampleInputPassword1" class="form-lable">State</label>
          <select id="exampleInputPassword1" name="state" required>
            <option value="      ">      </option>
            <option value="Karnataka">Karnataka</option>
            <option value="Hydrabad">Hydrabad</option>
            <option value="Telangana">Telangana</option>
            <option value="Kerala">Kerala</option>
            <option value="Maharastra">Maharastra</option>
        </select><br><br>
		</div>
		
		
		<div>
		  <label>Gender:</label>
        <input type="radio" id="male" name="gender" value="Male">
        <label for="male">Male</label>
        <input type="radio" id="female" name="gender" value="Female">
        <label for="female">Female</label><br><br>
		</div>
		
		<div>
		<label>Languages:</label>
        <input type="checkbox" id="kannada" name="languages" value="Kannada">
        <label for="kannada">Kannada</label>
        <input type="checkbox" id="english" name="languages" value="English">
        <label for="english">English</label>
        <input type="checkbox" id="hindi" name="languages" value="Hindi">
        <label for="hindi">Hindi</label>
        <input type="checkbox" id="Telugu" name="languages" value="Telugu">
        <label for="hindi">Telugu</label><br><br>
		</div>
		
		<input type="submit" class="btn btn-primary" value="Register">
		
		</form>
		</div>

</body>
</html>