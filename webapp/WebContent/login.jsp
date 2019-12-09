<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<!-- css -->
<style media="screen">
     body{ 

       background-image:url("img/wallpaper-gitar-hd.jpg"); 
       background-repeat: no-repeat; 
       background-size: cover; 
       text-align: center; 
    } 
    
    form{
        margin-top:10%;
        margin-left:30%;
         margin-right:30%;
          margin-bottom:4%;
       background-color:white;
        padding-left: 4em; 
        padding-top: 2em;
        padding-right: 6em;
        padding-bottom: 2em;


    }
    button{
      background-color: green;
      color: white;
      border-radius: 25%;
      margin-bottom: 1em;

    }
    .user{

      border: 1px solid black;
      padding-right:10%;
    }

    </style>

</head>


<!-- star of body tag  -->
<body>
<div class="container">
<div class="col-sm-12 col-md-4 col-lg-4 col-xl-4">

</div>
<div class="tab">
<form action="/webapp/LoginServlet" method="post">


<h2 style="font-family-">SING IN</h2>
     <input class="user"type="text" name="email" id="user"placeholder="email"value="" style="margin-top:5%; margin-bottom:1em; bo" ><br>
     <!-- onblur="checkUsername()" -->
     <input  class="user" type="password" name="password" id="pass" placeholder="Password" value="" required ><br><br>
 

       <input class="b"type="submit" name="" value="Sing in">  <br>
<!--       <p>create your account <button class="b"type="submit" name="button"onclick="location.href='register.jsp'">Sing up </button></p> <br> -->
       <p>create your account <a href="register.jsp">Sing up</a></p>
    
 <a class="f"href="a.html" >Forget Password?</a> 
</form>
 </div>
 
</div>

</body>

</html>