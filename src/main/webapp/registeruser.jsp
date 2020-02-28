<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration</title>
</head>
<body background="images/register.jpg">
<br/>
<br/>
<h2>REGISTRATION</h2>
<div align="left">
<form action="registerservlet">
<br/>
<br/>
Enter UserName:<input type="text" name="userName"   required/>
<br/>
<br/>
Enter MoblieNo:<input type="tel" name="mobNo" maxlength="10" pattern="\d{10}" title="Enter 10 digit" required/>
<br/>
<br/>
Enter City:<input type="text" name="city"  pattern="^[a-zA-Z]+$"  required/>
<br/>
<br/>
Enter Email:<input type="email" name="emailId" pattern="^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$"  required/>
<br/>
<br/>
Enter Password:<input type="password" name="password" required/>
<br/>
<br/>
<input type="submit" name="submit" value="Create User"/> 
<br/>
<br/>
<input type="reset" name="reset" value="Reset"/>  
</form>
</div>
</body>
</html>