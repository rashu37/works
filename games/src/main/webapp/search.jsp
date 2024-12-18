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
<h3>Games Details</h3>
<form action="search" method="get">
<input type="search" placeholder="Search by Game Name" name="gamename">
<input type="submit" value="Search">
<br>
<br>
<table >
		<thead>
			<tr>
			<th>Id</th>
				<th>Game Name</th>
				<th>No of Players</th>
				<th>Minimum Age</th>
				<th>Price</th>
				<th>Ratings</th>
				<th>Game Day</th>
				<th>Created By</th>
				<th>Action</th>
				
			</tr>
		</thead>

		<tbody>
		<c:forEach var="view" items="${list}">
			<tr>
			    <td>${view.id }</td>
				<td>${view.gamename}</td>
				<td>${view.noOfPlayers}</td>
				<td>${view.minAge}</td>
				<td>${view.price}</td>
				<td>${view.ratings}</td>
				<td>${view.gameDay}</td>
				<td>${view.createdBy}</td>
				<td><a href="update?id=${view.id}">update</a></td>
			</tr>
			</c:forEach>
		</tbody>

	</table>

</form>
</body>
</html>