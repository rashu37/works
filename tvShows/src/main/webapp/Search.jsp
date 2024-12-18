<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Search By Tv Show Name</h1>
<form action="search" method="get">

		<input type="search" placeholder="Search by Tv Show name"
			name="title"> <input type="submit" value="Search">
	</form>
	<br>
	<table border=1>
		<thead>
			<tr>
			<th>Id</th>
				<th>Show Title</th>
				<th>Language</th>
				<th>Reviews</th>
				<th>Ratings</th>
				<th>Available Date</th>
				<th>Created By</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="dto" items="${list}">
			<tr>
			  <td>${dto.id }</td>
			   <td>${dto.title }</td>
				<td>${dto.language }</td>
				<td>${dto.reviews}</td>
				<td>${dto.ratings }</td>
				<td>${dto.availableOn }</td>
				<td>${dto.createdBy }</td>
				<td><a href="update?id=${dto.id}">update</a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>