package com.onlineroom;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onlineroom.imp.HotelName;

/**
 * Servlet implementation class AddHotelservlet
 */
@SuppressWarnings("serial")
@WebServlet("/AddHotelservlet")
public class AddHotelservlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HotelName c=new HotelName();
        c.setPic(request.getParameter("pic"));
       // System.out.println("pic");
        c.setHotelId(Integer.parseInt(request.getParameter("hotel_id")));
       // System.out.println("hotel_id");
        c.setHotelName(request.getParameter("hotel_name"));
       // System.out.println("hotel_name");
        c.setLocation(request.getParameter("location"));
      //  System.out.println("location");
        c.setRating(Float.parseFloat(request.getParameter("rating")));
       // System.out.println("rating");
        c.setStatus(request.getParameter("status"));
        //System.out.println("status");
        c.setRoomType(request.getParameter("RoomType"));
       // System.out.println("RoomType");
        c.hotel(c);
		response.sendRedirect("features.jsp");

	}
	}
	


