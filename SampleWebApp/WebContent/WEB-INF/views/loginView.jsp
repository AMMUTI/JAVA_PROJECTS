<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="_header.jsp"></jsp:include>
<%-- 	<jsp:include page="_menu.jsp"></jsp:include> --%>
	<h3>Login page</h3>
	<p style="color:red;">${errorString}</p>
	<form method="post" action="${pageContext.request.contextPath}/Login">
	<table border="0">
		<tr>
			<td>User Name</td>
			<td><input type="text" name="userName" value="${user.userName}"></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" name="password" value="${user.password}"></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td><input type="text" name="gender" value="${user.gender}"></td>
		</tr>
		<tr>
			<td>Remember me</td>
			<td><input type="checkbox" name="rememberMe" value="y"></td>
			
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="Submit" />
            	<a href="${pageContext.request.contextPath}/">Cancel</a></td>
		</tr>
	</table>
	</form>
</body>
</html>