<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AddHotel</title>
</head>
<body background="images/adminpage.jpg">
<font color="white">
<h2>Add Hotel</h2>
<form action="AddHotelservlet" method="post">
Add Picture:<input type="file" name="pic" required/>
<br/>
<br/>
Add HotelId:<input type="text" name="hotel_id"  required/>
<br/>
<br/>
Add HotelName:<input type="text" name="hotel_name" required/>
<br/>
<br/>
Add Location:<input type="text" name="location"  required/>
<br/>
<br/>
Add Rating:<input type="float" name="rating" required/>
<br/>
<br/>
Add Status:<input type="text" name="status"  required/>
<br/>
<br/>
Add RoomType:<input type="text" name="RoomType" required/>
<br/>
<br/>
<input type="submit" name="submit" value="SUBMIT"/> 
</form>
</body>
</html>