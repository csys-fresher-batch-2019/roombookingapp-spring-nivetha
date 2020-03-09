<%@page import="com.nive.hotelroom.factory.DAOFactory"%>
<%@page import="com.nive.hotelroom.dao.HotelDAO"%>
<%@page import="com.nive.hotelroom.domain.HotelName"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.nive.hotelroom.dao.impl.HotelNameImpl"%>
    <%@page import="java.util.List"%>
    <%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
<%
HotelDAO dao=DAOFactory.getHotelDAO();
List<HotelName> h=dao.getHotelDetails2();
 out.print("<table border=1 align=center cellpadding=6><tr><th>Hotel Id</th><th>Hotel Name</th><th>Rating</th><th>Location</th><th>Status</th><th>Room Type</th></tr>");
	for (HotelName hotel : h) {
	System.out.println(hotel.toString());
	out.print("</td><td>"+hotel.getHotelId()+"</td><td>"+hotel.getHotelName()+"</td><td>"+hotel.getRating()+"</td><td>"+hotel.getLocation()+"</td><td>"+hotel.getStatus()+"</td><td>"+hotel.getRoomType()+"</td></tr>");
		}
		out.print("</table></font>");
%>
</form>
</body>
</html>