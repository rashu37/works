<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bank Details</title>
</head>
<body>
<div>
<form action="bank"  method="post" align="center">
<h3>Enter The Bank Details</h3>
Enter the Account Number:
<input type="tel" placeholder="Enter Account Number" name="accountNumber">
<br>
<br>
Account Holder Name:
<input type="text" placeholder="Account Holder Name " name="accountHolderName">
<br>
<br>
Select Account Type:
     
               <select   name="accountType">
				<option selected>Select Account Type</option>
				<option value="Joint Account">Joint Account</option>
				<option value="Personal Account">Personal Account</option>
				<option value="Bussiness Account">Bussiness Account</option>
	     </select> 
<br>
<br>
Enter Bank Balance:
<input type="number" placeholder="Bank Balance" name="balance">
<br>
<br>
<input type="submit" class="btn btn-primary"  value="submit">

</form>
</div>

</body>
</html>