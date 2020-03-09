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
 * Servlet implementation class UpdatePasswordservlet
 */
@WebServlet("/UpdatePasswordservlet")
public class UpdatePasswordservlet extends HttpServlet {   
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String Email=request.getParameter("emailId");
		String OldPassword=request.getParameter("passWord");
		String NewPassword=request.getParameter("password");
		CustomerDetails al=new CustomerDetails();
		al.setEmailId(Email);
		al.setPassword(OldPassword);
		al.setPassword(NewPassword);
		CustomerDAO c=DAOFactory.getCustomerDAO();
		try {
			c.changePassword(al);
		} catch (DBException e) {
			e.printStackTrace();
		}
		response.sendRedirect("index.jsp");

	}

}
