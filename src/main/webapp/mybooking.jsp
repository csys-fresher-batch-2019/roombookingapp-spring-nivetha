<%@page import="com.nive.hotelroom.domain.RoomType"%>
<%@page import="com.nive.hotelroom.factory.DAOFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
 <%@page import="java.util.List"%>
 <%@page import="java.util.ArrayList"%>
 <%@page import="com.nive.hotelroom.dao.impl.RoomTypeImpl"%>
 <%@page import="com.nive.hotelroom.dao.RoomTypeDAO"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
HttpSession sess=request.getSession();
int id=(Integer)sess.getAttribute("userid");
%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="images/book.jpg">
<h3> <center>MY BOOKING</center></h3>
<form action="mybooking.jsp">
<%
RoomType al=new RoomType();
al.setUser((Integer)sess.getAttribute("userid"));
RoomTypeDAO dao=DAOFactory.getRoomTypeDAO();
List<RoomType> list=dao.getUserbookeddetails(al);
out.print("<table border=1 align=center cellpadding=6><tr><th>User Id</th><th>Hotel Id</th><th>Members</th><th>Room Type</th><th>Bed Type</th><th>Check In</th><th>Check Out</th><th>Payment</th><th>Active Status</th></tr>");
	for (RoomType hotel : list) {
	System.out.println(hotel.toString());
	out.print("</td><td>"+hotel.getUser()+"</td><td>"+hotel.getHotel()+"</td><td>"+hotel.getMembers()+"</td><td>"+hotel.getRoomType()+"</td><td>"+hotel.getBedType()+"</td><td>"+hotel.getCheckIn()+"</td><td>"+hotel.getCheckOut()+"</td><td>"+hotel.getPayment()+"</td><td>"+hotel.getActiveStatus()+"</td></tr>");
		}
		out.print("</table></font>");
%>
</form>
</body>
</html>