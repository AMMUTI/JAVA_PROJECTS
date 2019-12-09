<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.util.ArrayList.*"%>
<%@ page import ="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>product display</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
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
<body >
<jsp:include page="_header.jsp"></jsp:include><br>
<!-- <center><h1>Product details</h1></center> -->


<table border="4" height="150" width="600" align="center" style="padding:1em;background-color: white;text-align:center; ">
<tr style="padding:1em;background-color: black;color:white">

<td width="122"><b>Product</b></td>
<td width="122"><b>Quantity</b></td>
<td width="175"><b>price</b></td>

</tr>
<%Iterator itr;%>
<% List data= (List)request.getAttribute("data");
for (itr=data.iterator(); itr.hasNext(); )
{
%>
<tr >
<td width="122"><%=itr.next()%></td>
<td width="175"><%=itr.next()%></td>
<td width="200"><%=itr.next()%></td>


</tr>
<%}%>
</table>
</body>
</html>