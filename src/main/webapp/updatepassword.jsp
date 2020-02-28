<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
</center><br/>
<br/>
<h2><div align = "center">Update Password</h2> 
<div align="center">
<form action="UpdatePasswordservlet">
Enter EmailId:<input type="email" name="emailId" required/>
<br/>
<br/>
Enter old Password:<input type="password" name="passWord" required/>
<br/>
<br/>
Enter new Password:<input type="password" name="password" required/>
<br/>
<br/>
<input type="submit" name="submit" value="update"/> 
</form>
</div>
</body>
</html>