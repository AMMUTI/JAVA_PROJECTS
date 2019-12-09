<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css"> -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<meta charset="ISO-8859-1">
<title>product list</title>
<style type="text/css">
#but{
background-color:green;
color:white;
border-radius:10%;
width:71px;
    height: 30px;

}
</style>
</head>
<body>
<div id="dis" style="margin-top:px;"></div>
<%-- <jsp:include page="_header.jsp"></jsp:include> --%>
<%-- <jsp:include page="_menu.jsp"></jsp:include> --%>

<form action="${pageContext.request.contextPath}/update" method="post" style="margin-top:2%;">
<div class="col-sm-4">


</div>
<div class="col-sm-4">
<h3>enter the product name and value which you want to  update  </h3><br>
      <input type="text" class="form-control" name="product"  placeholder="Product" required><br>
    
      <input type="text" class="form-control" name="quantity"  placeholder="Product quantity">
      <br>
      <input type="text" class="form-control" name="price"  placeholder="product price"><br>
 <input type="submit" value="submit" id="but"> 
   <h3 id="suc"></h3>
    </div>
 
 </form>
 
<%--  <jsp:include page="${pageContext.request.contextPath}/productdisplay"></jsp:include> --%>
<%-- <jsp:include page="productdisplay.jsp"></jsp:include> --%>
 <script>

//    $("#but").click(function(e) { 
//     e.preventDefault(); --> 
//    $("#suc").html("Data added successfully"); 
//    load("${pageContext.request.contextPath}/productList")
     
//     }); 
$( document ).ready(function() {
    
     $("#dis").load("${pageContext.request.contextPath}/productdisplay")
  });
 </script> 
 </body>
</html>