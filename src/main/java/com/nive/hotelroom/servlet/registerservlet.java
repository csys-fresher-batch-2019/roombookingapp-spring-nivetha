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
 * Servlet implementation class registerservlet
 */

@WebServlet("/registerservlet")
public class registerservlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("userName");
		String MoblieNo=request.getParameter("mobNo");
		String City=request.getParameter("city");
		String Email=request.getParameter("emailId");
		String Password=request.getParameter("password");		
		CustomerDetails c = new CustomerDetails();
		c.setUserName(username);
	    c.setMobNo(MoblieNo);
		c.setCity(City);
		c.setEmailId(Email);
		c.setPassword(Password);
		CustomerDAO p=DAOFactory.getCustomerDAO();
		try {
			p.save(c);
		} catch (DBException e) {
			e.printStackTrace();
		}
		response.sendRedirect("login.jsp");
	}
}
