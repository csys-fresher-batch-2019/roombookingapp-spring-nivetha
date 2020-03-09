package com.nive.hotelroom.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nive.hotelroom.dao.CustomerDAO;
import com.nive.hotelroom.domain.CustomerDetails;
import com.nive.hotelroom.exception.DBException;
import com.nive.hotelroom.factory.DAOFactory;

/**
 * Servlet implementation class UpdatePaymentservlet
 */
@WebServlet("/UpdatePaymentservlet")
public class UpdatePaymentservlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		int id=Integer.parseInt(request.getParameter("userId"));
		CustomerDetails al=new CustomerDetails();
        al.setUserId(id);
		CustomerDAO p=DAOFactory.getCustomerDAO();
		try {
			p.update(al);
		} catch (DBException e) {
			e.printStackTrace();
		}
		response.sendRedirect("features.jsp");
	}

}
