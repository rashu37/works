<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="update"  method="post" align="center">
        Id
        <input type="hidden" placeholder="Id" name="id" value="${dto.id }">
        <br><br>
		Enter the Game Name: <input type="text" placeholder="Game Name" name="gamename" value="${dto.gamename}" >
		 <br> <br>
		 Enter No of Players: <input type="number" placeholder="no of players" name="noOfPlayers" value="${dto.noOfPlayers}">
         <br> <br>
		 Enter Minimum Age: <input type="number" placeholder="min age" name="minAge" value="${dto.minAge}"> 
		 <br> <br>
		Enter price: <input type="text" placeholder="Price" name="price" value="${dto.price}">
		<br> <br> 
		Enter Ratings: <input type="number" placeholder="Ratings" name="ratings" value="${dto.ratings}"> <br> <br>
		 <br>
		  <input type="submit" class="btn btn-primary" value="update">

	</form>

</body>
</html>