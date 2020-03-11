package com.nive.hotelroom.servlet;
import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.nive.hotelroom.dao.RoomTypeDAO;
import com.nive.hotelroom.domain.RoomType;
import com.nive.hotelroom.exception.DBException;
import com.nive.hotelroom.factory.DAOFactory;

/**
 * Servlet implementation class Bookingservlet
 */
@WebServlet("/Bookingservlet")
public class Bookingservlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RoomType u=new RoomType();
   	    u.setUser(Integer.parseInt(request.getParameter("userId")));
		u.setHotel(Integer.parseInt(request.getParameter("hotelId")));
		u.setMembers(Integer.parseInt(request.getParameter("members")));
		u.setRoomType(request.getParameter("room_type"));
		u.setBedType(request.getParameter("bed_type"));
		u.setCheckIn(LocalDate.parse(request.getParameter("check_in")));
		u.setCheckOut(LocalDate.parse(request.getParameter("check_out")));
		RoomTypeDAO p=DAOFactory.getRoomTypeDAO();
		try {
			p.save(u);
		} catch (DBException e) {
			e.printStackTrace();
		}
		response.sendRedirect("booked.jsp");
	}
	}