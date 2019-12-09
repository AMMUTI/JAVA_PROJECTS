<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css"> -->
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
<div id="dis" ></div>
<%-- <jsp:include page="_header.jsp"></jsp:include> --%>
<form action="${pageContext.request.contextPath}/deleteproduct" method="post" style="margin-top:5%;">
<div class="col-sm-4">


</div>
<div class="col-sm-4">
      <input type="text" class="form-control" name="product"  placeholder="Product name"><br>
 		<input type="submit" value="submit" id="but"><br>
   <h3 id="suc"></h3>
    </div>
 <div id="dis"></div>
 </form>
 <script>
 $( document ).ready(function() {
    
      $("#dis").load("${pageContext.request.contextPath}/productdisplay")
  });
 </script> 
 
</body>
</html>