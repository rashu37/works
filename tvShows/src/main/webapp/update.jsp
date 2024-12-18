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

		Enter the Show Title:
		<input type="hidden" placeholder="Id"
			name="id" value="${dto.id}">
		 <input type="tel" placeholder="Title"
			name="title" value="${dto.title}" > <br> <br> Select Show Language: <select
			name="language" value="${dto.language}">
			<option selected>select language</option>
			<option value="Kannada">Kannada</option>
			<option value="English">English</option>
			<option value="Telagu">Telagu</option>
			<option value="Malyalam">Malyalam</option>
		</select> <br> <br> Enter Available Date: <input type="date"
			placeholder="Date" name="availableOn" value="${dto.availableOn}"> <br> <br>
		Enter Reviews: <input type="number" placeholder="Reviews"
			name="reviews" value="${dto.reviews}"> <br> <br> Enter Ratings: <input
			type="number" placeholder="Ratings" name="ratings" value="${dto.ratings}"> <br>
		<br>
		 <input type="submit" class="btn btn-primary" value="update">

	</form>

</body>
</html>