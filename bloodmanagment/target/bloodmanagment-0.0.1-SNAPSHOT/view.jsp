<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="save" method="get">

</form>
<table>
<tr>
<th>Sl.No</th>
<th>Your Name</th>
<th>Your Age</th>
<th>Blood Group</th>
</tr>
<tr>
<td>${listDto}</td>


</tr>
</table>

</body>
</html>