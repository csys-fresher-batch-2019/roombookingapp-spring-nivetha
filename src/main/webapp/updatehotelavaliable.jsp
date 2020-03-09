<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="images/book.jpg">
</center><br/>
<br/>
<h2><div align ="center">Update Hotel Available</h2> 
<div align="center">
<form action="UpdateAvaliablesevlet" method="post">
Enter HotelId:<input type="text" name="hotelId" required/>
<br/>
<br/>
Enter Status:<input type="text" name="status"  required/>
<br/>
<br/>
<input type="submit" name="submit" value="update"/> 
</form>
</div>
</body>
</html>