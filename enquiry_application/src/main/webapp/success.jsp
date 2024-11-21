<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
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
<div align="center">
		<h1>Applied Successfully</h1>
		<br>
		<table>
		<thead>
		<th>name</th>
		<th>email</th>
	    <th>contact number</th>
	    <th>description</th>
	    </thead>
	    <tbody>
	    <tr>
	    <td>${dto.getYourName()}</td>
	     <td>${dto.getEmailAddress()}</td>
	      <td>${dto.getContactNumber()}</td>
	       <td>${dto.getDescription()}</td>
	     </tr>
	    </tbody>
		</table>
		<a href="index.jsp"><input type="button" class="btn btn-primary" value="enquiry"></a>
</div>


</body>
</html>