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
<body>
	<form action="search" method="get">
    <h3>Search From Holder Name</h3>
		<input type="search" placeholder="Search by Holder name"
			name="accountHolderName"> 
			<input type="submit" value="Search">
	</form>
	<br>
	<table border=1>
			<thead>
				<tr>
				    <th>Id</th>
				    <th>Account Holder Name</th>
					<th>Payment Type</th>
					<th>Payment Amount</th>
					<th>From UPI</th>
					<th>To UPI</th>
					<th>Bank Name</th>
					<th>Created On</th>
					<th>Created By</th>
					<th>Action</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="view" items="${list}">
					<tr>
					    <td>${view.id}</td>
					    <td>${view.accountHolderName }</td>
						<td>${view.paymentType}</td>
						<td>${view.paymentAmount}</td>
						<td>${view.fromUpi}</td>
						<td>${view.toUpi}</td>
						<td>${view.bankName}</td>
						<td>${view.createdOn}</td>
						<td>${view.createdBy}</td>
						<td><a href="update?id=${view.id}">update</a></td>
					</tr>
				</c:forEach>
			</tbody>
			</table>

</body>

</body>
</html>