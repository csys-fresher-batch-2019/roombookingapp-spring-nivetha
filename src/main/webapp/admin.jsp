<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin</title>
</head>
<body background="images/adminpage.jpg">
<font color="white">
<h2><div align ="left">ADMINLOGIN</h2>
<div align="left">
<form action="Adminservlet" method="post">
Enter Adminname:<input type="text" name="adminName" required/>
<br/>
<br/>
Enter Password:<input type="password" name="password" required/>
<br/>
<br/>
<input type="submit" name="submit" value="Login"/> 
</form>
</div>
</font>
</body>
</html>