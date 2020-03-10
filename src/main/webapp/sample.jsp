<%@page import="com.nive.hotelroom.domain.HotelName"%>
<%@page import="com.nive.hotelroom.factory.DAOFactory"%>
<%@page import="com.nive.hotelroom.dao.HotelDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
.topnav {
  overflow: hidden;
  background-color: #333;
}

.topnav a {
  float: left;
  color: #d580ff;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
  background-color: #d580ff;
  color: purple;
}
</style>
</head>
<body>
<div class="topnav">
  <a class="active" href="sample.jsp">UserHome</a>
  <a href="mybooking.jsp">My Booking</a>
  <a href="index.jsp">Logout</a>
</div>
<h2>
<%
HttpSession sess=request.getSession();
int id=(Integer)sess.getAttribute("userid");
out.print("welcome  " +id+ "  !!!");
%></h2>
<br>
<title>Select</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<style>
.dropbtn {
  background-color: #e5b4fa;
  color: white;
  padding: 16px;
  font-size: 16px;
  border: none;
}

.dropdown {
  position: relative;
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color:#e5b4fa;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(3,1,3,0.2);
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}

.dropdown-content a:hover {background-color: #8d1ebd;}

.dropdown:hover .dropdown-content {display: block;}

.dropdown:hover .dropbtn {background-color: #8d1ebd;}
</style>
<body>

<div class="dropdown">
  <button class="dropbtn">search</button>
  <div class="dropdown-content">
    <a href="searchbyhotelname.jsp">Hotel Name</a>
    <a href="rating.jsp">Rating</a>
    <a href="location.jsp">Location</a>
  </div>
</div>
</body>
<style>
.text-block
{
   position:absolute;
   top:20px;
   right:20px;
}

.left{
float:left;
padding-left:10px;
padding-right:20px;
padding-top:20px;
padding-bottom:20px;
}
div.gallery {
  margin: 5px;
  border: 1px solid #ccc;
  float: left;
  width: 180px;
}

div.gallery:hover {
  border: 1px solid #777;
}

div.gallery img {
  width: 100%;
  height:auto;
}
</style>
<body style='background-color:"#F7F9F9";'> 
<br/><br/>
<h2>List Hotels</h2>
</br></br>
<%
HotelDAO dao=DAOFactory.getHotelDAO();
List<HotelName> list=dao.findAllHotels();
for (HotelName s : list) {
%>
<div class="left">
<div class="card-desk" class="left">
<div class="gallery" style="width: 18rem;height: 25rem;">
 <img src="images/<%=s.getPic() %>" class="card-img-top" alt="..." height="180" width="150">
  <div class="card-body">
  <h5 class="card-title">Hotel Name: &nbsp <%=s.getHotelName()%><br>Rating: &nbsp <%=s.getRating() %> <br>Location:&nbsp <%=s.getLocation()%><br>Status:&nbsp <%=s.getStatus() %><br>Roomtype:&nbsp <%=s.getRoomType() %><br><a href=roombooking.jsp?hoid=<%=s.getHotelId() %>>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspBook now</a> </h5>
 </div>
  </div>
  </div>
  </div>     
  <%   
   } %>
</body>
</html>