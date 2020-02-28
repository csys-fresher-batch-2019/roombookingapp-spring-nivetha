<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%HttpSession sess=request.getSession();
int id=(Integer)sess.getAttribute("userid");
String hotelid=request.getParameter("hoid");
 %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Room Booking</title>
</head>

<body background="images/img1.jpg">

<form action="Bookingservlet">
<br/>
<br/><h1>Booking Form</h1>
<br/>
<br/>

<p><b>Enter UserId:<input type="number" name="userId" value="<%out.print(id);%>"required /></b></p>
<p><b>Enter HotelId:<input type="number" name="hotelId" value="<%out.print(hotelid); %>" reqired/></b></p>
<p><b>Enter Members:</b>
<select id="members"name="members">
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
    <option value="4">4</option>
</select>

<p><b><label for="room_type">Enter RoomType:</label></b>
<select id="room_type" name="room_type"></p>
  <option value="ac">A/C</option>
  <option value="nonac">NON A/C</option>
</select>

<p><b><label for="bed_type">Enter BedType:</label></b>
<select id="bed_type" name="bed_type"></p>
  <option value="single bed">Single bed</option>
  <option value="king-size bed">king-size bed</option>
   <option value="queen-size bed">queen-size bed</option>
</select>
<br/>
<br/>
Enter CheckIn:<input type="date"  name="check_in" required/>
<br/>
<br/>
Enter CheckOut:<input type="date"  name="check_out" required/>
<br/>
<br/>
<input type="submit" name="submit" value="SUBMIT"/> 
<br/>

</form>
</body>
</html>