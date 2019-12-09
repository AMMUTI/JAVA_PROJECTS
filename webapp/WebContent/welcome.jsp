<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.util.ArrayList.*"%>
<%@ page import ="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<style type="text/css">
table{
border-color:2px solid green;

}

</style>
</head>
<body>
<!-- <h1>welcome</h1> -->
<%-- <h1 align="center">  <%="Welcome : "+request.getParameter("email")%> </h1> --%>
<h1 align="center">  Welcome </h1>
<table border="1" width="400" align="center" style="padding:1em;background-color: #d9e6d9;">
<tr style="padding:1em;">
<td width="122"><b>Name</b></td>
<td width="175"><b>Email</b></td>
<td width="200"><b>DOB</b></td>
<td width="200"><b>Address</b></td>
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
<td width="200"><%=itr.next()%></td>
</tr>
<%}%>
</table>


<script src="data.js"></script>





<!-- other way -->
<%-- <% --%>
<!--  	if (request.getAttribute("user")!=null) { -->
<!--   	 RegisterBO reg= (RegisterBO) request.getAttribute("user"); -->
<%-- %>> --%>
<!-- <h1>Record</h1> -->
<%-- <div> name: <%=reg.getNmae() %>></div> --%>
<%-- <div> name: <%=reg.getEmail() %>></div> --%>
<%-- <div> name: <%=reg.getDob() %>></div> --%>
<%-- <div> name: <%=reg.getAddress() %>></div> --%>

<%-- <% } --%>

<%-- %> --%>

<!-- <h1> no student record found</h1> -->

<!-- end of the secondway -->
</body>
</html>