<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
  <form action="search" method="get" >
	
		<div id="applyHelp" class="form-text">Register Your Details.</div>
		<br>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Your Name</label> <input type="text" class="form-control"
				id="exampleInputPassword1"  onChange="displayUserName()" name="yourName">
				<!-----<input type="submit" value="create"/>----->
               <span id="outputname"></span>
               
               
				
		</div>
		<br>
		<div class="mb-3">
			<label for="exampleInputPassword2" class="form-label">Contact Number</label> <input type="tel" class="form-control"
				id="exampleInputPassword2" onChange="displayUserNumber()" name="contactNumber">
			 <span id="outputnumber"></span>
		</div>
		<br>
		
		<div class="mb-3">
			<label for="exampleInputPassword3" class="form-label">Email Id</label> <input type="text" class="form-control"
				id="exampleInputPassword3" onChange="displayUserEmail()" name="email">
			 <span id="outputemail"></span>
		</div>
		<br>
		<input type="reset" class="btn btn-primary" value="reset" >
		<input id="submitbutton" type="submit" class="btn btn-primary" value="Apply" disabled>
		
		
   </form>
</div>
      
<script type="text/javascript" >
    function displayUserName() {
    	
    	const name = document.getElementById('exampleInputPassword1').value;
	    document.getElementById('outputname').innerHTML = 'username:'+name;
	    console.log('username'+name);
	    if(name.length<=1 ){
	    	document.getElementById('outputname').innerHTML = "Name should greater than 3 alphabets";
	    	}else{
		document.getElementById('outputname').innerHTML = 'username:'+name;
		}
	    validateForm();
	    }
    
    function displayUserNumber(){
    	
    	const number=document.getElementById('exampleInputPassword2').value;
    	document.getElementById('outputnumber').innerHTML='Contact Number'+number;
    	console.log('Contact Number:'+number);
    	if(number.length==10){
    		document.getElementById('outputnumber').innerHTML = 'Contact Number:'+number;
    		
    	}else{
    		document.getElementById('outputnumber').innerHTML= "Number should 10 digit"
    	}
    	validateForm();
    }
    
    function displayUserEmail() {
    	const email=document.getElementById('exampleInputPassword3').value;
    	var emailPattern = /\S+@\S+\.\S+/;
  	    var valid= emailPattern.test(email);
  	    if(valid){
  	  	document.getElementById('outputemail').innerHTML='Email ID:'+email;
  	    console.log('Email ID:'+email);
  	
  	    }else{
  	    	document.getElementById('outputemail').innerHTML='Invalid EmailID'
  	    	
  	    }
  	    validateForm();
  	    
    }
    
    function validateForm() {
        const name = document.getElementById('exampleInputPassword1').value;
        const number = document.getElementById('exampleInputPassword2').value;
        const email = document.getElementById('exampleInputPassword3').value;
        const submitButton = document.getElementById('submitbutton');

        const isNameValid = name.length > 3;
        const isNumberValid = number.length === 10;
        const isEmailValid = /\S+@\S+\.\S+/.test(email);

        submitButton.disabled = !(isNameValid && isNumberValid && isEmailValid);
    }
   
</script>

</body>
</html>