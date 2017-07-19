<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<%=request.getContextPath() %>/sito/css/style.css" rel="stylesheet" type="text/css">

<title>Login</title>
</head>

<body>
<div class="login-page">
  <div class="form">
    <form class="login-form" action="LoginBack" method="post">
      <input type="text" name="username" placeholder="username"/>
      <input type="password" name="userpass" placeholder="password"/>
      <input type="submit" class="button" value="login"/>  
      <!-- <a href="<%=request.getContextPath() %>/sito/HomeUtente.jsp" class="button">login</a> -->
      <p class="message">Not registered? <a href="#">create account</a></p>
    </form>
  </div>
</div>
		
			
</body>
</html>