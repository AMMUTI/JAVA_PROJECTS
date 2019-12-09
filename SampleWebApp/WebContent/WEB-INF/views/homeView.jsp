<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<title>Home page</title>
</head>
<body>
	<jsp:include page="_header.jsp"></jsp:include>
<%-- 	<jsp:include page="_menu.jsp"></jsp:include> --%>
	<h3>Home page</h3>
	This is demo simple web page creating using jsp.
	<ul>
		<li>login</li>
		<li>Storing user information</li>
		<li>Add the project</li>
		<li>delete product</li>
		
	</ul>
	<jsp:include page="_footer.jsp"></jsp:include>
</body>
</html>