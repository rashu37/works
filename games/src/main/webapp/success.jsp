<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Games Details</h1>
	<table border=1>
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
				
			</tr>
		</thead>

		<tbody>
			<tr>
			<td>${games.id }</td>
				<td>${games.gamename}</td>
				<td>${games.noOfPlayers}</td>
				<td>${games.minAge}</td>
				<td>${games.price}</td>
				<td>${games.ratings}</td>
				<td>${games.gameDay}</td>
				<td>${games.createdBy}</td>
			</tr>
		</tbody>

	</table>


</body>
</html>