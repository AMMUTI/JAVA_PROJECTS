	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<style>
 body{ 

       background-image:url("img/1.jpg"); 
       background-repeat: no-repeat; 
       background-size: cover; 
       text-align: center; 
    } 
form{
border:1px solid black;
padding-left:5%;
width:400px;
margin-left:30%;
margin-right:20%;
margin-top:2%;
margin-bottom:2%;
background-color:white;
}




</style>


</head>
<body>
	<center><h1>create your account</h1></center>
	<div class="container ">
		<form action="/webapp/RegisterServlet" method="post">
	
		  <!-- 	input for name -->
		  
		  <label  style="margin-top: 2em;"> Name  </label> <br>
          <input type="text" name="name" value="" placeholder="Enter your name" style="color:black;" id="name" maxlength="9" > <br>
          <p id="n" ></p>
          
          
		<!--           input for email -->
          
          <label  style="margin-top:2em;">Email  </label> <br>
          <input type="text" name="emil" value=""   placeholder="Enter the email" id="email">
          <p id="result" style="color:black"></p>
          
          
          <!--           input for date of birth -->
          
          <label  style="margin-top:2em;">Date of birth  </label> <br>
          <input type="date" name="dob" value=""   placeholder="" id="dd">
          <p id="re"style="color:black"></p>
          
          
          
          <label  style="margin-top:2em;">address  </label> <br>
          <input type="text" name="address" value=""   placeholder="" id="dd">
          <p id="add"style="color:black"></p>
          
          
          <!--           input for password -->
          
          <label for="" style="margin-top:2em;">Password </label> <br>
          <input type="password" name="password" id="pswd" onfocus="f()" onkeyup="pass()" placeholder="Password">
          <p id="p" style="color:black"></p>
          
          
          <!--           input for confirm password -->
          
          <label for="" style="margin-top:2em;"  >Confirm Password </label > <br>
          <input type="password" name="pswd1" value="" style=" color:black;" id="cpswd"  onkeyup="cpass()" placeholder="Confirm Password">
          <p id="rp"style="color:black"></p>
            

            <button class="b"type="submit" name="button" id="but">Sing in</button><b><br>
          <p>Already have account ? <a href="login.jsp">log in</a> here</p>
		</form>
	
			<script src="valid.js"></script>
	</div>
</body>
</html>