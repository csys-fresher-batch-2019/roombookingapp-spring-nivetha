package com.nive.hotelroom.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nive.hotelroom.dao.HotelDAO;
import com.nive.hotelroom.domain.HotelName;
import com.nive.hotelroom.exception.DBException;
import com.nive.hotelroom.factory.DAOFactory;

/**
 * Servlet implementation class AddHotelservlet
 */
@WebServlet("/AddHotelservlet")
public class AddHotelservlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HotelName c=new HotelName();
        c.setPic(request.getParameter("pic"));
        c.setHotelId(Integer.parseInt(request.getParameter("hotel_id")));
        c.setHotelName(request.getParameter("hotel_name"));
        c.setLocation(request.getParameter("location"));
        c.setRating(Float.parseFloat(request.getParameter("rating")));
        c.setStatus(request.getParameter("status"));
        c.setRoomType(request.getParameter("RoomType"));
        HotelDAO b=DAOFactory.getHotelDAO();
        try {
			b.save(c);
		} catch (DBException e) {
			e.printStackTrace();
		}
		response.sendRedirect("features.jsp");

	}
	}
	


