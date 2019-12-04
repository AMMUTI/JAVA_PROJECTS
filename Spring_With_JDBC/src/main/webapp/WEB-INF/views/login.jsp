<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style type="text/css">
form{
margin-top:60px;
margin-left:350px;
margin-right:350px;
border:solid 1px black;
padding:3em;
}
</style>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
</head>
<body>
	<center>

		<form action="loginprocess"  >
			<h3 style="color:red">Login </h3>
			<input type="text" class="form-control" placeholder="username"  		id="username" name="username"><br><br>
			<input type="text" class="form-control" placeholder="password"  		id="password" name="password"><br><br>
			<input type="submit" style="background-color:black;color:white;" value="submit">
		</form>
	</center>
</body>
</html>
	