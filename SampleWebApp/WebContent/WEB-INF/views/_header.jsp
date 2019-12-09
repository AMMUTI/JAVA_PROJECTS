<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!-- <meta charset="ISO-8859-1"> -->
<!-- <title>header</title> -->
<!-- <div style="background:#E0E0E0;height:55px; padding:5px;"> -->
<!-- 	<div style="float:left; margin-left:2%"> -->
		
		
<%-- <a href="${pageContext.request.contextPath}/">Home</a> --%>
<!-- | -->
<%-- <a href="${pageContext.request.contextPath}/productList">product List</a> --%>
<!-- | -->
<%-- <a href="${pageContext.request.contextPath}/userInfo">My Account Info</a> --%>
<!-- | -->
<%-- <a href="${pageContext.request.contextPath}/Login">Login</a> --%>

	
<!-- </div> -->

<!-- 	<div style="float:right;padding:10px; text-align: right;"> -->
<%-- 		Hello <b>${loginedUser.userName}</b> --%>
<!-- 		<br/> -->
<!-- 		Search<input name="search"> -->
<!-- 	</div> -->
<!-- </div> -->






<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"> -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<!-- <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script> -->
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>




    <nav class="navbar navbar-expand-md navbar-light bg-light">
       
        
        <div id="navbarCollapse" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="nav-item">
                    <a href="${pageContext.request.contextPath}/" class="nav-link">Home</a>
                </li>
                <li class="nav-item">
                    <a href="${pageContext.request.contextPath}/userInfo" class="nav-link">User Info</a>
                </li>
                
                <li class="nav-item dropdown">
                    <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">Product List</a>
                    <div class="dropdown-menu">
                        <a href="${pageContext.request.contextPath}/productList" class="dropdown-item">Add product</a>
                        <a href="${pageContext.request.contextPath}/deleteproduct" class="dropdown-item">Delete Product</a>
                        <a href="${pageContext.request.contextPath}/update" class="dropdown-item">Update product</a>  
                        
                    </div>
                </li>
                <li class="nav-item">
                    <a href="${pageContext.request.contextPath}/Login" class="nav-link">Login </a>
                </li>
                
           
        </div>
    </nav>

                                                       

