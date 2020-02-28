<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body><center><img src="images/hotelroom.jpg" alt="hotel room" height=800% width=50%/>
</center><br/>
<br/>
<h2><div align = "center">Login to your account</h2> 
<div align="center">
<form action="Loginservlet" method="post">
Enter EmailId:<input type="email" name="emailId" required/>
<br/>
<br/>
Enter Password:<input type="password" name="passWord" required/>
<br/>
<br/>
<input type="submit" name="submit" value="Login"/>
<a href="updatepassword.jsp">Change password</a>
</form> 
</div>
</body>
</html>