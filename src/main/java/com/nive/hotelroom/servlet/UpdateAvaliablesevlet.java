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
 * Servlet implementation class UpdateAvaliablesevlet
 */

@WebServlet("/UpdateAvaliablesevlet")
public class UpdateAvaliablesevlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("hotelId"));
		String status=request.getParameter("status");
		HotelName al=new HotelName();
		al.setHotelId(id);
		al.setStatus(status);
	   HotelDAO p=DAOFactory.getHotelDAO();
		try {
			p.updatetable(al);
		} catch (DBException e) {
			e.printStackTrace();
		}
		response.sendRedirect("Allhotel.jsp");
	}

}
