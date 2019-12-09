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
    <h3>Hello: ${loginedUser.userName}</h3>
    User Name: ${loginedUser.userName}<b></b>
    <jsp:include page="_footer.jsp"></jsp:include>
  <br />
</body>
</html>