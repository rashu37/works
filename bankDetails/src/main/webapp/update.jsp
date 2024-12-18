<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
<form action="update"  method="post" align="center">
<h3>Update The Bank Details</h3>
<input type="hidden" placeholder="Enter Account Number" name="id" value="${dto.id}">
<br>
<br>
Enter the Account Number:
<input type="tel" name="accountNumber" value="${dto.accountNumber}">
<br>
<br>
Account Holder Name:
<input type="text" placeholder="Account Holder Name " name="accountHolderName" value="${dto.accountHolderName}">
<br>
<br>
Select Account Type:
     
               <select   name="accountType" value="${dto.accountType}">
				<option selected>Select Account Type</option>
				<option value="Joint Account">Joint Account</option>
				<option value="Personal Account">Personal Account</option>
				<option value="Bussiness Account">Bussiness Account</option>
	     </select> 
<br>
<br>
Enter Bank Balance:
<input type="number" placeholder="Bank Balance" name="balance" value="${dto.balance}">
<br>
<br>
<input type="submit" class="btn btn-primary"  value="update">

</form>
</div>

</body>
</html>